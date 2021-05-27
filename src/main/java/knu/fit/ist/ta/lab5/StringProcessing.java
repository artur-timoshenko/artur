/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab5;

import java.math.BigInteger;
import java.security.SecureRandom;
import knu.fit.ist.ta.lab5.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import org.springframework.util.StringUtils;


/**
 *
 * @author Andrey
 */
public class StringProcessing {
    
    String text;

    public StringProcessing() {

        text = "Animals or people that are provided with unique identifiers (UIDs) and the ability to transfer data over a network without requiring human-to-human or human-to-computer interaction. A thing in the internet of things can be a person with a heart monitor implant, a farm animal with a biochip transponder, an automobile that has built-in sensors to alert the driver when tire pressure is low or any other natural or man-made object that can be assigned an Internet Protocol (IP) address and is able to transfer data over a network. Increasingly, organizations in a variety of industries are using IoT to operate more efficiently, better understand customers to deliver enhanced customer service, improve decision-making and increase the value of the business. How IoT works An IoT ecosystem consists of web-enabled smart devices that use embedded systems, such as processors, sensors and communication hardware, to collect, send and act on data they acquire from their environments. IoT devices share the sensor data they collect by connecting to an IoT gateway or other edge device where data is either sent to the cloud to be analyzed or analyzed locally. Sometimes, these devices communicate with other related devices and act on the information they get from one another. The devices do most of the work without human intervention, although people can interact with the devices -- for instance, to set them up, give them instructions or access the data. The connectivity, networking and communication protocols used with these web-enabled devices largely depend on the specific IoT applications deployed. IoT can also make use of artificial intelligence (AI) and machine learning to aid in making data collecting processes easier and more dynamic .The internet of things helps people live and work smarter, as well as gain complete control over their lives. In addition to offering smart devices to automate homes, IoT is essential to business. IoT provides businesses with a real-time look into how their systems really work, delivering insights into everything from the performance of machines to supply chain and logistics operations";

       text = cleanString(text);
    }
    
    public String getText() {
        return this.text;
    }
    
    public String getCleanText()
    {
        return String.join(" ", getList(text));
    }

    public List<String> getList(String text) {
        List<String> result = Arrays.asList(text.split(" "));
        return result;
    }

    public Set<String> getSet(String text) {
        Set<String> result = new HashSet<>();
        result.addAll(Arrays.asList(text.split(" ")));
        return result;
    }

    private String cleanString(String input){
    input = input.toLowerCase();
    input = input.replaceAll("-{2,}","");
    input = input.replaceAll(" {2,}"," ");
    input = input.replaceAll("[^\\w -]", "").trim();       
    return input;
    }
    
    /**
     *
     * @param s
     * @return
     */
    
    SecureRandom random = new SecureRandom();

    public String rdEl()
    {
        return new BigInteger(130, random).toString(32);
    }
     
    public ArrayList<Obj> initList(int amount){ 
        ArrayList<Obj> list = new ArrayList<Obj>();

        if (amount < 1) {
            Obj elem = new Obj();               
            list.add(elem);
        }
        
        for (int i = 0; i < amount; i++) {
            Obj elem = new Obj();               
            list.add(elem);
        }         
        return list;
    }
    
    public  ArrayList<String> showList(ArrayList<Obj> list) {
        ArrayList<String> list1 = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {  
            Obj tmp = list.get(i);
            list1.add(tmp.getRdString() + " - " + tmp.getRdInt());
        }  
        return list1;
    }

    List InitList(String amount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

    