
package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestClass {

    public static void main(String[] args) throws IOException {

        //--------------------------------------update----------------------------------
        try {

            Double totalPrice = 0.0;

            //initializing new pizzaconfig
            PizzaConfig pizza = new PizzaConfig();
            // seting price of pizza
            pizza.setBasePrice(2000);
            totalPrice = 2000.0;
            // adding an optionset using name
            System.out.println("---Options(Choose The Number)---");
            System.out.println("1.Meat");
            System.out.println("2.Vegetarian");

            String optNum = new BufferedReader(new InputStreamReader(System.in)).readLine();
            if (optNum.trim().equalsIgnoreCase("1")) {
                pizza.AddOptionSet("meat");
                OptionSet delivery = new OptionSet();
                delivery.setName("delivery");

                System.out.println("---Delivery Mode(Choose The Number)---");
                System.out.println("1.Eat-In");
                System.out.println("2.Take-Away");
                System.out.println("3.Delivery");

                String delNum = new BufferedReader(new InputStreamReader(System.in)).readLine();

                if (delNum.trim().equalsIgnoreCase("1")) {
                    OptionSet.Option takeAway = delivery.new Option("Eat-In", 0);
                    delivery.AddChoice(takeAway);// adding option to optionset
                    pizza.AddOptionSet(delivery); //addind optionset to pizzaconfig
                } else if (delNum.trim().equalsIgnoreCase("2")) {
                    OptionSet.Option takeAway = delivery.new Option("Take-away", 1000);
                    delivery.AddChoice(takeAway);// adding option to optionset
                    pizza.AddOptionSet(delivery); //addind optionset to pizzaconfig
                    totalPrice = totalPrice + 2000;
                } else if (delNum.trim().equalsIgnoreCase("3")) {
                    OptionSet.Option takeAway = delivery.new Option("delivery", 0);
                    delivery.AddChoice(takeAway);// adding option to optionset
                    pizza.AddOptionSet(delivery); //addind optionset to pizzaconfig
                }
                System.out.println("---Ingredients(Choose The Number)---");
                System.out.println("1.Beef");
                System.out.println("2.Pepperoni");
                System.out.println("3.Anchovy");
                System.out.println("4.Ham");

                String choiceNum = new BufferedReader(new InputStreamReader(System.in)).readLine();

                //finding optionset and add an option with name
                if (choiceNum.trim().equalsIgnoreCase("1")) {
                    pizza.getOptionSet("meat").AddChoice("Beef", 1000);
                    totalPrice = totalPrice + 1000;
                } else if (choiceNum.trim().equalsIgnoreCase("2")) {
                    pizza.getOptionSet("meat").AddChoice("pepperoni", 800);
                    totalPrice = totalPrice + 800;
                } else if (choiceNum.trim().equalsIgnoreCase("3")) {
                    pizza.getOptionSet("meat").AddChoice("Anchovy", 500);
                    totalPrice = totalPrice + 500;
                } else if (choiceNum.trim().equalsIgnoreCase("4")) {
                    pizza.getOptionSet("meat").AddChoice("Ham", 400);
                    totalPrice = totalPrice + 400;
                }

                System.out.println("Add Another Choice(Y/N)?");

                String choice = new BufferedReader(new InputStreamReader(System.in)).readLine();
                while (choice.equalsIgnoreCase("N")) {
                    System.out.println("---Ingredients(Choose The Number)---");
                    System.out.println("1.Beef");
                    System.out.println("2.Pepperoni");
                    System.out.println("3.Anchovy");
                    System.out.println("4.Ham");

                    choiceNum = new BufferedReader(new InputStreamReader(System.in)).readLine();

                    if (choiceNum.trim().equalsIgnoreCase("1")) {
                        pizza.getOptionSet("meat").AddChoice("Beef", 1000);
                        totalPrice = totalPrice + 1000;
                    } else if (choiceNum.trim().equalsIgnoreCase("2")) {
                        pizza.getOptionSet("meat").AddChoice("pepperoni", 800);
                        totalPrice = totalPrice + 800;
                    } else if (choiceNum.trim().equalsIgnoreCase("3")) {
                        pizza.getOptionSet("meat").AddChoice("Anchovy", 500);
                        totalPrice = totalPrice + 500;
                    } else if (choiceNum.trim().equalsIgnoreCase("4")) {
                        pizza.getOptionSet("meat").AddChoice("Ham", 400);
                        totalPrice = totalPrice + 400;
                    }
                    System.out.println("Add Another Choice(Y/N)?");
                    choice = new BufferedReader(new InputStreamReader(System.in)).readLine();

                }
                pizza.print();

            } else if (optNum.trim().equalsIgnoreCase("2")) {
                pizza.AddOptionSet("vegetarian");
                OptionSet delivery = new OptionSet();
                delivery.setName("delivery");

                System.out.println("---Delivery Mode(Choose The Number)---");
                System.out.println("1.Eat-In");
                System.out.println("2.Take-Away");
                System.out.println("3.Delivery");

                String delNum = new BufferedReader(new InputStreamReader(System.in)).readLine();

                if (delNum.trim().equalsIgnoreCase("1")) {
                    OptionSet.Option takeAway = delivery.new Option("Eat-In", 0);
                    delivery.AddChoice(takeAway);// adding option to optionset
                    pizza.AddOptionSet(delivery); //addind optionset to pizzaconfig
                } else if (delNum.trim().equalsIgnoreCase("2")) {
                    OptionSet.Option takeAway = delivery.new Option("Take-away", 1000);
                    delivery.AddChoice(takeAway);// adding option to optionset
                    pizza.AddOptionSet(delivery); //addind optionset to pizzaconfig
                    totalPrice = totalPrice + 2000;
                } else if (delNum.trim().equalsIgnoreCase("3")) {
                    OptionSet.Option takeAway = delivery.new Option("delivery", 0);
                    delivery.AddChoice(takeAway);// adding option to optionset
                    pizza.AddOptionSet(delivery); //addind optionset to pizzaconfig
                }

                System.out.println("---Ingredients(Choose The Number)---");
                System.out.println("1.Mushroom");
                System.out.println("2.Onion");
                System.out.println("3.Black Olives");
                System.out.println("4.Pineapple");
                System.out.println("5.Tomato");

                String choiceNum = new BufferedReader(new InputStreamReader(System.in)).readLine();

                //finding optionset and add an option with name
                if (choiceNum.trim().equalsIgnoreCase("1")) {
                    pizza.getOptionSet("vegetarian").AddChoice("Mushroom", 1000);
                    totalPrice = totalPrice + 1000;
                } else if (choiceNum.trim().equalsIgnoreCase("2")) {
                    pizza.getOptionSet("vegetarian").AddChoice("Onion", 800);
                    totalPrice = totalPrice + 800;
                } else if (choiceNum.trim().equalsIgnoreCase("3")) {
                    pizza.getOptionSet("vegetarian").AddChoice("Black Olives", 500);
                    totalPrice = totalPrice + 500;
                } else if (choiceNum.trim().equalsIgnoreCase("4")) {
                    pizza.getOptionSet("vegetarian").AddChoice("Pineapple", 400);
                    totalPrice = totalPrice + 400;
                } else if (choiceNum.trim().equalsIgnoreCase("5")) {
                    pizza.getOptionSet("vegetarian").AddChoice("Tomato", 300);
                    totalPrice = totalPrice + 300;
                }

                System.out.println("Add Another Choice(Y/N)?");

                String choice = new BufferedReader(new InputStreamReader(System.in)).readLine();
                while (choice.equalsIgnoreCase("N")) {
                    System.out.println("---Ingredients(Choose The Number)---");
                    System.out.println("1.Mushroom");
                    System.out.println("2.Onion");
                    System.out.println("3.Black Olives");
                    System.out.println("4.Pineapple");
                    System.out.println("5.Tomato");

                    choiceNum = new BufferedReader(new InputStreamReader(System.in)).readLine();

                    if (choiceNum.trim().equalsIgnoreCase("1")) {
                        pizza.getOptionSet("vegetarian").AddChoice("Mushroom", 1000);
                        totalPrice = totalPrice + 1000;
                    } else if (choiceNum.trim().equalsIgnoreCase("2")) {
                        pizza.getOptionSet("vegetarian").AddChoice("Onion", 800);
                        totalPrice = totalPrice + 800;
                    } else if (choiceNum.trim().equalsIgnoreCase("3")) {
                        pizza.getOptionSet("vegetarian").AddChoice("Black Olives", 500);
                        totalPrice = totalPrice + 500;
                    } else if (choiceNum.trim().equalsIgnoreCase("4")) {
                        pizza.getOptionSet("vegetarian").AddChoice("Pineapple", 400);
                        totalPrice = totalPrice + 400;
                    } else if (choiceNum.trim().equalsIgnoreCase("5")) {
                        pizza.getOptionSet("vegetarian").AddChoice("Tomato", 300);
                        totalPrice = totalPrice + 300;
                    }
                    System.out.println("Add Another Choice(Y/N)?");
                    choice = new BufferedReader(new InputStreamReader(System.in)).readLine();

                }
                pizza.print();
                System.out.println("Total Price = "+ totalPrice);
            }
            
            
            //add another option
            pizza.getOptionSet("meat").AddChoice("beef", 200);
            System.out.println("-------------printing after adding option in optionset meat----------");
            pizza.print();
            //---------------------------------delete----------------------------
            //delete option
            pizza.getOptionSet("meat").deleteOption("beef");
            System.out.println("-----------printing after deleting an option in optionset meat------");
            pizza.print();
            //delete optionset
            System.out.println("--------printing after deleting optionset delivery-----");
            pizza.deleteOptionSet("meat");
            pizza.print();
            //--------------------------------------update----------------------------------
            //updating the price of delivery
            pizza.getOptionSet(0).getChoice(0).setPrice(15000);

            System.out.println("--------printing after updating the price of takeaway-----");

            pizza.print();

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        //--------------------------------------update----------------------------------
       

    }
}
