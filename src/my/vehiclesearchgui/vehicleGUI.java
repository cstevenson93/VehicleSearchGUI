package my.vehiclesearchgui;

import java.util.ArrayList;//Import ArrayList class
import java.util.Scanner;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

class vehicleGUI
{
  String filePath;

  String properties[] = new String[]{ "Employee","Phone","Extension","Make","Model","Tag","Color"};
  


  ArrayList<String> employee = new ArrayList<>(); //Create ArrayList Object
  ArrayList<String> phone = new ArrayList<>(); //Create ArrayList Object
  ArrayList<String> ext = new ArrayList<>(); //Create ArrayList Object
  ArrayList<String> make = new ArrayList<>(); //Create ArrayList Object
  ArrayList<String> model = new ArrayList<>(); //Create ArrayList Object
  ArrayList<String> tag = new ArrayList<>(); //Create ArrayList Object
  ArrayList<String> color = new ArrayList<>(); //Create ArrayList Object

  vehicleGUI(String fileName)
  {     
      
        try 
        {
          FileReader inputFile = new FileReader("./" +fileName);
          filePath = fileName;
          
        try
            {
            Scanner scan = new Scanner(inputFile);
            String nextWord = "";
            String makeVar = "";
            String modelVar = "";
            
            while(scan.hasNext())
                {
                
                employee.add(scan.next()+ " " + scan.next());
                System.out.println("Line skip: " +scan.next());
                phone.add(scan.next());
                System.out.println("Line skip: " +scan.next());
                ext.add(scan.next());
                System.out.println("Line skip: " +scan.next());
                
                nextWord = scan.next();
                makeVar = nextWord;
                while (!"end".equals(nextWord))
                        {
                          nextWord = scan.next();
                          System.out.println("current Word: " + nextWord);
                          if (nextWord.equals("end"))
                          {
                          break;
                          } else
                          {
                              System.out.println("Word added");
                          makeVar += " " + nextWord;                               
                          }

                          
                        }
                System.out.println("Make var: " + makeVar);
                make.add(makeVar);
                
                nextWord = scan.next();
                modelVar = nextWord;
                while (!"end".equals(nextWord))
                        {
                          nextWord = scan.next();
                          System.out.println("current Word: " + nextWord);
                          if (nextWord.equals("end"))
                          {
                          break;
                          } else
                          {
                              System.out.println("Word added");
                          modelVar += " " + nextWord;                               
                          }
                          
                        
                        }
                //System.out.println(modelVar);
                model.add(modelVar);
                System.out.println("Line skip: " +nextWord);
                tag.add(scan.next());
                System.out.println("Line skip: " +scan.next());
                String colorVal = scan.next();
                System.out.println("Color val: " + colorVal);
                color.add(colorVal);
                System.out.println("Line skip: " +scan.next());
                }
            }
        finally
            {
            inputFile.close();
            }
        }
catch(FileNotFoundException exception)
    {
	JOptionPane.showMessageDialog(null, fileName + " not found." , "File Not Found", JOptionPane.ERROR_MESSAGE);
        System.exit(0);
    }
catch(IOException exception)
    {
        JOptionPane.showMessageDialog(null, "Unexpected I/O error occured." , "I/O Error", JOptionPane.ERROR_MESSAGE);
	System.out.println("Unexpected I/O error occured.");
    }
      
       
  }

  public  void addVehicle(String employeeVal,String phoneVal, String extVal,String makeVal,String modelVal,String tagVal, String colorVal)
  {
    


      if(employeeVal.contains(" ") && !employeeVal.endsWith(" ") && !phoneVal.contains(" ") 
              && !extVal.contains(" ") && !makeVal.endsWith(" ") && !tagVal.endsWith(" ") 
              && !modelVal.endsWith(" ") && !colorVal.contains(" "))
      {
      System.out.println("Values being sent: " + employeeVal + " " + phoneVal + " " + makeVal + " " + modelVal + " " + tagVal + " " + colorVal);
      employee.add(employeeVal);
    phone.add(phoneVal);
    ext.add(extVal);
    make.add(makeVal);
    model.add(modelVal);
    tag.add(tagVal);
    color.add(colorVal);
      }

    

  }
  
  public  void searchByTag(String tagVal)
  {
    String output = "";
    System.out.println("Method launches");
    int count = 0;
      for (String i : tag )
      {
          if (i.equalsIgnoreCase(tagVal))
            {
                output += "[Employee: " + employee.get(count) + "] ";
                output += "[Phone: " + phone.get(count) + "] ";
                output += "[Extension: " + ext.get(count) + "] ";
                output += "[Make: " + make.get(count) + "] ";
                output += "[Model: " + model.get(count) + "] ";
                output += "[Tag: " + tag.get(count) + "] ";
                output += "[Color: " + color.get(count) + "]\n\n";
                
                
                
            }
          count++;
      }
      if (output.equals(""))
      {
      JOptionPane.showMessageDialog(null, "No vehicles with that tag were found.");
      }else 
        {
        JOptionPane.showMessageDialog(null, output);
        }
    }
  
   public  void searchByColor(String colorVal)
  {
    String output = "";
    System.out.println("Method launches");
    int count = 0;
      for (String i : color )
      {
          if (i.equalsIgnoreCase(colorVal))
            {
                output += "[Employee: " + employee.get(count) + "] ";
                output += "[Phone: " + phone.get(count) + "] ";
                output += "[Extension: " + ext.get(count) + "] ";
                output += "[Make: " + make.get(count) + "] ";
                output += "[Model: " + model.get(count) + "] ";
                output += "[Tag: " + tag.get(count) + "] ";
                output += "[Color: " + color.get(count) + "]\n\n";
                
                
            }
          count++;
      }
      if (output.equals(""))
      {
      JOptionPane.showMessageDialog(null, "No vehicles with that tag were found.");
      }else 
        {
        JOptionPane.showMessageDialog(null, output);
        }
    }
  
  public  void searchByLastName(String lastNameVal)
  {
    String output = "";
    String lastNameSub = "";
    System.out.println("Method launches");
    int count = 1;
      for (String i : employee )
      {
          System.out.println(i);
          //Isolates Last Name
           lastNameSub = i.substring(i.length() - lastNameVal.length(), i.length());
           //System.out.println(lastNameSub + " lastNameVal length: " +lastNameVal.length() + " i length: " + i.length() + "lastNameSub length: " + lastNameSub.length());
          if (lastNameSub.equalsIgnoreCase(lastNameVal))
            {
                output += "[Employee: " + employee.get(count) + "] ";
                output += "[Phone: " + phone.get(count) + "] ";
                output += "[Extension: " + ext.get(count) + "] ";
                output += "[Make: " + make.get(count) + "] ";
                output += "[Model: " + model.get(count) + "] ";
                output += "[Tag: " + tag.get(count) + "] ";
                output += "[Color: " + color.get(count) + "]\n\n";
                
                
                
                //System.out.println("Loop number " +count);
                
                
                
            }
          count++;
      }
      if (output.equals(""))
      {
      JOptionPane.showMessageDialog(null, "No Employees with that Last Name were found.");
      }else 
        {
        JOptionPane.showMessageDialog(null, output);
        }
    }
  
  
  public  void searchByFullName(String employeeVal)
  {
    String output = "";
    System.out.println("Method launches");
    int count = 0;
      for (String i : employee )
      {
          if (i.equalsIgnoreCase(employeeVal))
            {
                output += "[Employee: " + employee.get(count) + "] ";
                output += "[Phone: " + phone.get(count) + "] ";
                output += "[Extension: " + ext.get(count) + "] ";
                output += "[Make: " + make.get(count) + "] ";
                output += "[Model: " + model.get(count) + "] ";
                output += "[Tag: " + tag.get(count) + "] ";
                output += "[Color: " + color.get(count) + "]\n\n";
                
                
            }
          count++;
      }
      if (output.equals(""))
      {
      JOptionPane.showMessageDialog(null, "No Employees with that Full Name were found.");
      }else 
        {
        JOptionPane.showMessageDialog(null, output);
        }
    }
  

  public void removeEmployeeByName(String employeeVal)
  {
    int count = 1;
    int index;
    int amountFound = 0;
    boolean found = false;
    for (String i : employee)
    {
       index = employee.indexOf(i);
      if (i.equals(employeeVal))
      {
        employee.remove(index);
        phone.remove(index);
        ext.remove(index);
        make.remove(index);
        model.remove(index);
        tag.remove(index);
        color.remove(index);
        
        found = true;
        

        amountFound++;
        
      } 
      
      
      count++;
    }
    
    if(amountFound == 1)
    {
        JOptionPane.showMessageDialog(null,"The vehicle belonging to " + employeeVal 
            + " has been successfully removed", "Removal Successful",
                JOptionPane.INFORMATION_MESSAGE);
        if(amountFound > 1)
        {
        JOptionPane.showMessageDialog(null,"The vehicles belonging to " + employeeVal 
            + " have been successfully removed", "Removal Successful",
                JOptionPane.INFORMATION_MESSAGE);
        }
            
    }
    
    if(found == false)
      {
        System.out.println("Method finished");
        JOptionPane.showMessageDialog(null,
                "No vehicles were found belonging to that tag\n"
                + "Please make sure your input is correct and that there are no unnecessary spaces.",
                "Input Error",
                JOptionPane.ERROR_MESSAGE);
      }
  }
  
  public void removeEmployeeByTag(String tagVal)
  {int count = 1;
    boolean found = false;
    for (String i : tag)
    {
      int index = tag.indexOf(i);
      if (i.equals(tagVal))
      {
        employee.remove(index);
        phone.remove(index);
        ext.remove(index);
        make.remove(index);
        model.remove(index);
        tag.remove(index);
        color.remove(index);
        
        found = true;
        
        JOptionPane.showMessageDialog(null,
                "The vehicle with the tag " + tagVal 
                        + " has been successfully removed",
                "Removal Successful",
                JOptionPane.INFORMATION_MESSAGE);
        
        
      break;
      } 
      
      //System.out.println("Pass " + count);
      
      count++;
    }
    
    if(found == false)
      {
        System.out.println("Method finished");
        JOptionPane.showMessageDialog(null,
                "No vehicles were found belonging to that tag\n"
                + "Please make sure your input is correct and that there are no unnecessary spaces.",
                "Input Error",
                JOptionPane.ERROR_MESSAGE);
      }
  }

  
  public String getVehicles()
  {
    int count = 0;
    System.out.println("employee arrayList size " + employee.size());
    String[] infoArray = new String[employee.size()];
     for(String i: employee)
     {
         infoArray[count] = "[EMPLOYEE] " + employee.get(count) + " \n";
         infoArray[count] += "[PHONE] " + phone.get(count) + " \n";
         infoArray[count] += "[EXTENSION] " + ext.get(count) + " \n";
         infoArray[count] += "[MAKE] " + make.get(count) + " \n";
         infoArray[count] += "[MODEL] " + model.get(count) + " \n";
         infoArray[count] += "[TAG] " + tag.get(count) + " \n";
         infoArray[count] += "[COLOR] " + color.get(count) + " \n";
         
         count++;
     }
     count = 1;
    System.out.println("infoArray size " + infoArray.length);
    
    String output = "";

    for (String i : infoArray) 
        {
        output = output + "Vehicle " + count + "\n" + i + "\n\n";
        System.out.println("\n"+"Vehicle " + count);
        if (count < infoArray.length)
                {
                    count++;
                }
        
        System.out.println(i);
        }
    System.out.println("Internal output " + output);
    return output;
    //JOptionPane.showMessageDialog(null, output);

  }
  
  public void setFileName(String fileName)
  {
  try 
        {
          FileReader inputFile = new FileReader(fileName);
          
        try
            {
            Scanner scan = new Scanner(inputFile);
            
            employee.clear();
            phone.clear();
            ext.clear();
            make.clear();
            model.clear();
            tag.clear();
            color.clear();
            
            while(scan.hasNext())
                {
                employee.add(scan.next()+ " " + scan.next());
                phone.add(scan.next());
                ext.add(scan.next());
                make.add(scan.next());
                model.add(scan.next());
                tag.add(scan.next());
                color.add(scan.next());
                }
            }
        finally
            {
            inputFile.close();
            }
        }
catch(FileNotFoundException exception)
    {
	JOptionPane.showMessageDialog(null, fileName , " not found", JOptionPane.ERROR_MESSAGE);
    }
catch(IOException exception)
    {
	System.out.println("Unexpected I/O error occured.");
    }
      
       
  }
  
  public String getFilePath()
  {
  return filePath;
  }
  
  
  public void saveVehicles()
  {
  PrintWriter writer = null;
      try 
      {
          writer = new PrintWriter(filePath);
      } 
        catch (FileNotFoundException ex) 
        {
          Logger.getLogger(vehicleGUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
  for (String i : employee)
  {
  //System.out.println(phone.get(phone.indexOf(i)));
  writer.println(employee.get(employee.indexOf(i)) + " end");
  writer.println(phone.get(employee.indexOf(i)) + " end");
  writer.println(ext.get(employee.indexOf(i)) + " end");
  writer.println(make.get(employee.indexOf(i)) + " end");
  writer.println(model.get(employee.indexOf(i)) + " end");
  writer.println(tag.get(employee.indexOf(i)) + " end");
  writer.println(color.get(employee.indexOf(i)) + " end" +"\n");
  }
 
  writer.close();
  }







}