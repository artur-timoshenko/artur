/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.springframework.stereotype.Component;

/**
 *
 * @author Andrey
 */
@Component
public class Text {
    public static String text;
    static Matcher matcher;
    static Pattern pattern;
    
    public Text(){
          text = "Animals or people that are provided with unique identifiers (UIDs) and the ability to transfer data over a network without requiring human-to-human or human-to-computer interaction. A thing in the internet of things can be a person with a heart monitor implant, a farm animal with a biochip transponder, an automobile that has built-in sensors to alert the driver when tire pressure is low or any other natural or man-made object that can be assigned an Internet Protocol (IP) address and is able to transfer data over a network. Increasingly, organizations in a variety of industries are using IoT to operate more efficiently, better understand customers to deliver enhanced customer service, improve decision-making and increase the value of the business. How IoT works An IoT ecosystem consists of web-enabled smart devices that use embedded systems, such as processors, sensors and communication hardware, to collect, send and act on data they acquire from their environments. IoT devices share the sensor data they collect by connecting to an IoT gateway or other edge device where data is either sent to the cloud to be analyzed or analyzed locally. Sometimes, these devices communicate with other related devices and act on the information they get from one another. The devices do most of the work without human intervention, although people can interact with the devices -- for instance, to set them up, give them instructions or access the data. The connectivity, networking and communication protocols used with these web-enabled devices largely depend on the specific IoT applications deployed. IoT can also make use of artificial intelligence (AI) and machine learning to aid in making data collecting processes easier and more dynamic .The internet of things helps people live and work smarter, as well as gain complete control over their lives. In addition to offering smart devices to automate homes, IoT is essential to business. IoT provides businesses with a real-time look into how their systems really work, delivering insights into everything from the performance of machines to supply chain and logistics operations";
}
    
    public static String cleanText(String ctext){
        
        ctext = ctext.toLowerCase();
        ctext = ctext.replaceAll("\\bthe|and\\b", "").trim();
        ctext = ctext.replaceAll("\\b\\w{1,2}\\b", "").trim();
        ctext = ctext.replaceAll("[^\\w -]", "").trim();
        ctext = ctext.replaceAll("-{2,}","");
        ctext = ctext.replaceAll(" {2,}"," ");
        return ctext;
    }
    
    public static List<String> getList(String text) {
        List<String> result = Arrays.asList(text.split(" "));
        return result;
    }
    
    public static int sizeOfList(String text) {
        List<String> result = Arrays.asList(text.split(" "));
        return result.size();
    }
    
    public static Set<String> getSet(String text) {
        Set<String> result = new HashSet<>();
        result.addAll(Arrays.asList(text.split(" ")));
        return result;
    }
    
    public static int sizeOfSet(String text) {
        Set<String> result = new HashSet<>();
        result.addAll(Arrays.asList(text.split(" ")));
        return result.size();
    }
    
    public static ArrayList<String> first7Often(String text) {
        List<String> words = Arrays.asList(text.split(" "));
        ArrayList<String> result = new ArrayList<String>();
        
        int size = words.size();
        int m = 7; // m - the number of words to perform calculations for
        int[] z = new int[size]; 
        // z[i] - frequency of occurrence of the word with serial number i
        int[] n = new int[m];
        int[] t = new int[m];
        for(int j=0;j<size;++j){
            z[j]=0;
            for(int i=0; i<size ;++i){
                    
                if(words.get(j).equals(words.get(i))){
                    z[j]=z[j]+1;
                }
                
            }
            for(int q=0;q<j;++q){   //avoid the same words
                if(words.get(j).equals(words.get(q))) z[j]=0;
            }
        }
            
        for(int j=0; j<m;++j){
            for(int i=0;i<size;++i){
                   
                if(z[i]>t[j]){
                    t[j]=z[i];  //the highest frequency of occurence 
                    n[j]=i;     //the serial number of the word
                }   
                    
            }
            z[n[j]]=0;  //not to repeat words
        }
        for(int y=0;y<m;++y){
            result.add(words.get(n[y])+" - "+t[y]);
        }
        
        return result;
    }
    
    public static int notU(String text){
        int p = 0;
        pattern = Pattern.compile(("\\b[a-tv-z]+\\b"));
        matcher = pattern.matcher(text);
        while(matcher.find()){
            ++p;
        }
        return p;
    }
    
    public static int words4Letters(String text){
        int p = 0;
        pattern = Pattern.compile(("\\b[a-z]{4}\\b"));
        matcher = pattern.matcher(text);
        while(matcher.find()){
            ++p;
        }
        return p;
    }
    
    public static ArrayList<String> seq3Let(String text){
        int p = 0;
        String stext = text;
        String fseq;       
        
        int t=0, m=6, d=0; // m - the number of sequences to perform calculations with
        // d - so as not to repeat the sequence, t - frequency of occurrence
        String seq="";     
        ArrayList<String> all = new ArrayList<String>();
        ArrayList<String> result = new ArrayList<String>();
        
        for(int q=0;q<m;++q){
            t=0;
            for(int i=3, j=0;i<text.length();++i){
                p=0;
                d=0;
                if(stext.charAt(i-1)==' '){
                    i += 3;
                    j += 3;
                }
                fseq = stext.substring(j, i);
                for(int z=0;z<q;++z){
                    if(fseq.equals(all.get(z))){d = 1;}
                }
                pattern = Pattern.compile(fseq);
                matcher = pattern.matcher(text);
                while(matcher.find() && d!=1){
                    ++p;
                }
                if(p>t){t=p;seq=fseq;}
                ++j;
            }
            all.add(seq);
            result.add(seq+" - "+t);
            }
        return result;
    }
}
    
