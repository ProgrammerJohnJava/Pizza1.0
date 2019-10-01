
package model;




public class PizzaConfig {
    private double basePrice;
    private OptionSet opset[]=new OptionSet[0];
   

    public PizzaConfig() {
    }

    public PizzaConfig(double basePrice, OptionSet[] opset) {
        this.basePrice = basePrice;
        this.opset = opset;
      
    }

   

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

     public void setOpset(OptionSet[] opset) {
        this.opset = opset;
    }
    public OptionSet[] getOptionSets() {
        
        return opset;
    }
    //----------------------------------------retrieve-------------------------------------------
    //method to get optionSet by index
    public OptionSet getOptionSet(int index) {
        
          if (this.opset == null
            || index < 0
            || index >= this.opset.length) { 
  
            throw new IndexOutOfBoundsException("cannot find this index");
        } 
  
   
        int indexFound=-1;
        for (int i = 0; i < this.opset.length; i++) { 
  
            // if the index is  found
            // return this choice
            if (i == index) { 
                indexFound=i;
                break;
            } 
  
           
        } 
        return this.opset[indexFound];
        
    }
    //method to get optionset by name
     public OptionSet getOptionSet(String name) {
         //first check if optionset array is empty
          if (this.opset.length == 0 ) { 
  
            throw new IndexOutOfBoundsException("the array is empty");
        }
          //checking if name provided is not null or empty
         if (name.trim().length()== 0 ) { 
  
            throw new IndexOutOfBoundsException("provide the name of optionset");
        }    
         boolean found=false;
         int foundIndex=-1;
          for (int i = 0; i < this.opset.length; i++) { 
  
            // if the index is  found
            // return this choice
            if (name.equals(opset[i].getName()) ) { 
                foundIndex=i;
                found=true;
                break;
            } 
  
           
        } 
          //if name wasnot found throw an exception  
          if(!found){
              throw new NullPointerException("name was not found");
          }
          //else return the element
          return this.opset[foundIndex];
  
                 

          
     }

//------------------------------delete---------------------------------------   
    //method to delete optionset by index
    public void deleteOptionSet(int index){
         if (this.opset== null
            || index < 0
            || index >= this.opset.length) { 
  
            throw new IndexOutOfBoundsException("invalid index");
        } 
  
        // Create another array of size one less 
           OptionSet[] temp = new OptionSet [this.opset.length - 1];
  
        // Copy the elements except the index 
        // from original array to the other array 
        for (int i = 0, k = 0; i < this.opset.length; i++) { 
  
            // if the index is 
            // the removal element index 
            if (i == index) { 
                continue; 
            } 
  
            // if the index is not 
            // the removal element index 
            temp[k++] = this.opset[i]; 
        } 
        
         this.opset = temp;
       
    
    }
    //method to delete optionset by name
    public void deleteOptionSet(String name){
      if (this.opset.length == 0 ) { 
  
            throw new IndexOutOfBoundsException("the array is empty");
        }
          //checking if name provided is not null or empty
         if (name.trim().length()== 0 ) { 
  
            throw new IndexOutOfBoundsException("provide the name of optionset");
        }    
         boolean found=false;
        
               // Create another array of size one less 
           OptionSet[] temp = new OptionSet [this.opset.length - 1];
           
          for (int i = 0,k=0; i < this.opset.length; i++) { 
  
            // if the index is  found
            // return this choice
            if (name.equals(opset[i].getName()) ) { 
                found=true;
                 continue; 
               
            } 
              // if the index is not 
            // the removal element index 
            temp[k++] = this.opset[i]; 
  
           
        } 
          //if name wasnot found throw an exception  
          if(!found){
              throw new NullPointerException("name was not found");
          }
          
               this.opset = temp;
     
    }
   
//------------------------------------adding--------------------------------
    // add optionset with optionSet
     public void AddOptionSet(OptionSet optionSet){
         //creating a temporaly array of size  more 
        OptionSet[] temp = new OptionSet[this.opset.length + 1];
        //copy all elements from opset to temp
        System.arraycopy(this.opset, 0, temp, 0, this.opset.length);
        //assigning the new element
        temp[this.opset.length]=optionSet;
        //
        this.opset = temp;
    }
     public void AddOptionSet(String name){
         //creating a temporaly array of size  more 
        OptionSet newOptionSet =new OptionSet(name);
         AddOptionSet(newOptionSet);
        
    }
     
     
     
     
     
    @Override
    public String toString() {
         StringBuilder result=new StringBuilder();
            result.append("PizzaConfig{" ).append(" ").append("basePrice=").append(basePrice).append(" ,optSet= ");
       String joiner="";
         for(OptionSet  p : opset){
             result.append(joiner).append(p.toString());
             joiner=",";
             
        }
         result.append(" } ");
        return result.toString();
       
    
    
    }
    public void print(){
            System.out.println(this.toString());
        }
    
    

   
    
    
    
    
    
    
    
    
}
