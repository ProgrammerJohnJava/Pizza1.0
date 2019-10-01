
package model;


public class OptionSet {

    private String name;
    private Option[] choices=new Option[0];

    protected OptionSet() {
    }

    protected OptionSet(String name) {
        this.name = name;
    }
    
    
    

    protected String getName() {
        return name;
        
        
    }

    protected void setName(String name) {
        this.name = name;
    }
     protected void setChoices(Option[] choices) {
        this.choices = choices;
    }

    protected Option[] getChoices() {
        return choices;
    }
    //--------------------------------retrieve--------------------------------------------
    // method to get option by index
    protected Option getChoice(int index) {
         // If the array is empty 
        // or the index is not in array range 
     
        if (this.choices == null
            || index < 0
            || index >= this.choices.length) { 
  
            throw new IndexOutOfBoundsException("cannot find this index");
        } 
  
   
        int indexFound=-1;
        for (int i = 0; i < this.choices.length; i++) { 
  
            // if the index is  found
            // return this choice
            if (i == index) { 
                indexFound=i;
            } 
  
           
        } 
        return this.choices[indexFound];
        
      
    }
 //method to get option by name
    protected Option getOption(String name) {
         //first check if optionset array is empty
          if (this.choices.length == 0 || this.choices==null) { 
  
            throw new IndexOutOfBoundsException("the array is empty");
        }
          //checking if name provided is not null or empty
         if (name.trim().length()!= 0 && name!=null ) { 
        } else {
             throw new IndexOutOfBoundsException("provide the name of optionset");
        }    
         boolean found=false;
         int foundIndex=-1;
          for (int i = 0; i < this.choices.length; i++) { 
  
            // if the index is  found
            // return this choice
                         

            if (choices[i].getName().equals(name) ) { 
                foundIndex=i;
                found=true;
            
                break;
            } 
  
           
        } 
          //if name wasnot found throw an exception  
          if(found==false){
              throw new NullPointerException("name was not found");
          }
          //else return the element
          return this.choices[foundIndex];
  
                 

          
     }
   

   
    //---------------addding-------------------------------------------------
    //method to add add an option
    protected void AddChoice(Option option){
        Option[] temp = new Option[this.choices.length + 1];
        System.arraycopy(this.choices, 0, temp, 0, this.choices.length);
        temp[this.choices.length]=option;
        this.choices = temp;
    }
    
      protected void AddChoice(String name,double price){
       Option newOption=new Option(name, price);
          AddChoice(newOption);
    }
      //-------------------------------------------deleting------------------------------------
     //method to delete option by index
    protected void deleteChoice(int index){
          // If the array is empty 
        // or the index is not in array range 
        // return the original array 
        if (this.choices == null
            || index < 0
            || index >= this.choices.length) { 
  
            throw new IndexOutOfBoundsException("invalid index");
        } 
  
        // Create another array of size one less 
           Option[] temp = new Option[this.choices.length - 1];
  
        // Copy the elements except the index 
        // from original array to the other array 
        for (int i = 0, k = 0; i < this.choices.length; i++) { 
  
            // if the index is 
            // the removal element index 
            if (i == index) { 
                continue; 
            } 
  
            // if the index is not 
            // the removal element index 
            temp[k++] = this.choices[i]; 
        } 
        
         this.choices = temp;
       
    }
    //method to delete option by name
      protected void deleteOption(String name){
      if (this.choices.length == 0 ) { 
  
            throw new IndexOutOfBoundsException("the array is empty");
        }
          //checking if name provided is not null or empty
         if (name.trim().length()== 0 ) { 
  
            throw new IndexOutOfBoundsException("provide the name of optionset");
        }    
         boolean found=false;
        
               // Create another array of size one less 
           Option[] temp = new Option [this.choices.length - 1];
           
          for (int i = 0,k=0; i < this.choices.length; i++) { 
  
            // if the index is  found
            // return this choice
            if (name.equals(choices[i].getName()) ) { 
                found=true;
                 continue; 
               
            } 
              // if the index is not 
            // the removal element index 
            temp[k++] = this.choices[i]; 
  
           
        } 
          //if name wasnot found throw an exception  
          if(!found){
              throw new NullPointerException("name was not found");
          }
          
               this.choices = temp;
     
    }
   
    
    @Override
    public String toString() {
         StringBuilder result=new StringBuilder();
            result.append("OptionSet{").append(" ").append("name=").append(" ").append(name).append(" , choices= ");
       String joiner="";
         for(Option p : choices){
             result.append(joiner).append(p.toString());
             joiner=",";
             
        }
         result.append(" } ");
        return result.toString();
    }
     protected void print(){
            System.out.println(this.toString());
        }
    
    


    protected class Option {

        private String name;
        private double price;

        protected Option(String name, double price) {

            this.name = name;
            this.price = price;
        }

        protected String getName() {
            return name;
        }

        protected void setName(String name) {
            this.name = name;
        }

        protected double getPrice() {
            return price;
        }

        protected void setPrice(double price) {
            this.price = price;
        }

       
        @Override
        public String toString() {
            StringBuilder result=new StringBuilder();
            result.append("Option{").append(" ").append("name=").append(" ").append(name).append(", price= ").append(price).append("}");
           return result.toString();
        }
        protected void print(){
            System.out.println(this.toString());
        }
        
    }
    }
