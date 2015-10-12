/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.util.Scanner;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.LinkedList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author zain
 */
public class start4 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException{
        
     String name = "a";
     String name1 = "b";
     String name3 = "c";
    
     start categories = new start();

     start2 currentFoodItem = new start2("A1",2.0,3,"t1",true);
     start2 currentFoodItem1 = new start2("B1",2.0,3,"t12",true);
     start2 currentFoodItem2 = new start2("C1",2.0,3,"t3",true);

     start3 linklist = new start3();
     
     start1 currentCategoryNode = new start1(name3);
     
     linklist.add("App");
     linklist.add("Meal");
     linklist.add("Drinks");

  System.out.print(linklist);
System.out.println("UP1 " + currentCategoryNode.getName());
System.out.println("UP#" + categories.getCategories());
 
 System.out.println("UP " + currentFoodItem.getName());
       
     
     Scanner Key = new Scanner(System.in);
     System.out.println("Z");
    String[] user = { "Add", "Remove", "Update", "Search" };

    JFrame frame = new JFrame("Categories");
    String Cat = (String) JOptionPane.showInputDialog(frame, 
        "What would like to do",
        "Categories",
        JOptionPane.QUESTION_MESSAGE, 
        null, 
        user, 
        user[0]);

    // favoritePizza will be null if the user clicks Cancel
    System.out.printf("It is  %s.\n", Cat);
    int user1 = 0;
    
    if (Cat=="Add"){
        user1= 1;
    }
    else if (Cat == "Remove"){
        user1=2;
    }
      else if (Cat == "Update"){
        user1=3;}
     else if(Cat == "Search"){
        user1=4;}
    
    switch(user1)
    {
        case 1: String newCat = JOptionPane.showInputDialog(frame, "What would you like to add?");
                linklist.add(newCat);
                System.out.print(linklist);
            break;
        case 2: newCat = JOptionPane.showInputDialog(frame, "What would you like to Remove?");
                linklist.delete(newCat);
                System.out.print(linklist);
            break;
        case 3: newCat = JOptionPane.showInputDialog(frame, "What would you like to Update?");
                categories.updateByName(name, newCat);
                System.out.print(linklist);
            break;
        case 4:newCat = JOptionPane.showInputDialog(frame, "What would you like to Search?");
                categories.search(newCat);
                System.out.print(linklist);
            break;
            
    }
    
    
    
  
  
  



    
     String fileName = "Cat.txt";
     String line = null;
     
     try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = new BufferedReader(fileReader);
         
            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }   

            // Always close files.
            bufferedReader.close();         
        }
        
        catch(IOException e) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
       
        }
     
    }

    
}
     
     


