package jvacationrental;

import javax.swing.*;
import java.awt.event.*;

public class JVacationRental extends JFrame implements ActionListener {
//variable declaration
   private final int PARK_SIDE1= 600;
   private final int POOL_SIDE1 = 750;
   private final int LAKE_SIDE1 = 825;
   private final int ONE_BEDROOM1= 75;
   private final int TWO_BEDROOMS1 = 150;
   private final int THREE_BEDROOMS1 = 225;
   private final int MEALS_1= 200;
//setting labels
   private JLabel jlblLocations1 = new JLabel("LOCATION: ");
   private JLabel jlblBedrooms1 = new JLabel("BEDROOMS: ");
   private JLabel jlblMeals1 = new JLabel("INCLUDE MEALS: ");
//setting button variables and designing buttons
   private JRadioButton jrbtnPark1 = new JRadioButton("PARK SIDE");
   private JRadioButton jrbtnPool1= new JRadioButton("POOL SIDE");
   private JRadioButton jrbtnLake1= new JRadioButton("LAKE SIDE");
   private JRadioButton jrbtnOne1 = new JRadioButton("1");
   private JRadioButton jrbtnTwo1 = new JRadioButton("2");
   private JRadioButton jrbtnThree1 = new JRadioButton("3");
   private JRadioButton jrbtnYes1 = new JRadioButton("YES");
   private JRadioButton jrbtnNo1 = new JRadioButton("NO");
//location bedroom and meals button
   private ButtonGroup groupLocations1 = new ButtonGroup();
   private ButtonGroup groupBedrooms1 = new ButtonGroup();
   private ButtonGroup groupMeals1 = new ButtonGroup();
//button to calculate and result
   private JButton jbtnCalculate1 = new JButton(" CALCULATE TOTAL RENT");
   private JButton jbtnReset1= new JButton("RESET ");
//button for total rent
   private JLabel result1 = new JLabel("TOTAL RENT: $ 0.0");
//panel setting with the corresponding variables
   private JPanel jpnlLocations1 = new JPanel();
   private JPanel jpnlBedrooms1 = new JPanel();
   private JPanel jpnlMeals1 = new JPanel();
   private JPanel jpnlButton1 = new JPanel();
   private JPanel jpnlLabel1 = new JPanel();
   private JPanel Panel1 = new JPanel();
    //initializing the cost
   private int locationRent1 = 0;
   private int bedroomsRent1 = 0;
   private int mealsCost1 = 0;
//main method
 public static void main(String[] args)
   {   
          JVacationRental frame = new JVacationRental();
          frame.setSize(350, 250);
          frame.setVisible(true);
   }  
//constructor
 public JVacationRental()
   {
          super("LAMBERT’S VACATION RENTALS ");
          //adding frames for the variables
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          groupLocations1.add(jrbtnPark1);
          groupLocations1.add(jrbtnPool1);
          groupLocations1.add(jrbtnLake1);
   
          groupBedrooms1.add(jrbtnOne1);
          groupBedrooms1.add(jrbtnTwo1);
         groupBedrooms1.add(jrbtnThree1);
   
          groupMeals1.add(jrbtnYes1);
          groupMeals1.add(jrbtnNo1);
   
          jpnlLocations1.add(jlblLocations1);
          jpnlLocations1.add(jrbtnPark1);
          jpnlLocations1.add(jrbtnPool1);
          jpnlLocations1.add(jrbtnLake1);
   
          jpnlBedrooms1.add(jlblBedrooms1);
          jpnlBedrooms1.add(jrbtnOne1);
          jpnlBedrooms1.add(jrbtnTwo1);
          jpnlBedrooms1.add(jrbtnThree1);
   
          jpnlMeals1.add(jlblMeals1);
          jpnlMeals1.add(jrbtnYes1);
          jpnlMeals1.add(jrbtnNo1);
   
          jpnlButton1.add(jbtnCalculate1);
          jpnlButton1.add(jbtnReset1);
          jpnlLabel1.add(result1);
   
          Panel1.add(jpnlLocations1);
          Panel1.add(jpnlBedrooms1);
          Panel1.add(jpnlMeals1);
          Panel1.add(jpnlButton1);
          Panel1.add(jpnlLabel1);
        //adding panel           
          add(Panel1);
   
 jrbtnPark1.addItemListener(new LocationsListener());
 jrbtnPool1.addItemListener(new LocationsListener());
 jrbtnLake1.addItemListener(new LocationsListener());
            jrbtnOne1.addItemListener(new BedroomsListener());
            jrbtnTwo1.addItemListener(new BedroomsListener());
                jrbtnThree1.addItemListener(new BedroomsListener());
            jrbtnYes1.addItemListener(new MealsListener());
            jrbtnNo1.addItemListener(new MealsListener());
            jbtnCalculate1.addActionListener(this);
            jbtnReset1.addActionListener(this);
}
//setting action which has to be performed
   public void actionPerformed(ActionEvent e)
   {
  Object source = e.getSource();
   if(source == jbtnCalculate1)
              {
//calculating the rental value.
double totalRent1 = locationRent1 + bedroomsRent1 + mealsCost1;
                        //displaying rental amount
         result1.setText("TOTALRENT: $ " + totalRent1);       
              }
          else if(source == jbtnReset1)
          {
                   groupLocations1.clearSelection();
                   groupBedrooms1.clearSelection();
                   groupMeals1.clearSelection();
                   result1.setText("Total Rent: $ 0.0");
                   //setting initial value =0
                   locationRent1 = 0;
                   bedroomsRent1 = 0;
                   mealsCost1 = 0;
          }   
   }
   private class LocationsListener implements ItemListener
   {
       public void itemStateChanged(ItemEvent e)
       {
           Object source = e.getItem();
     if(source == jrbtnPark1)
                   locationRent1 = PARK_SIDE1;
           else if(source == jrbtnPool1)
                   locationRent1 = POOL_SIDE1;
           else if(source == jrbtnLake1)
                     locationRent1 = LAKE_SIDE1;
           else
                   locationRent1 = 0;
       }   
   }
   private class BedroomsListener implements ItemListener
   {
       public void itemStateChanged(ItemEvent e)
       {
           Object source = e.getItem();
     if(source == jrbtnOne1)
                     bedroomsRent1 = ONE_BEDROOM1;
           else if(source == jrbtnTwo1)
                   bedroomsRent1 = TWO_BEDROOMS1;
           else if(source == jrbtnThree1)
                   bedroomsRent1 = THREE_BEDROOMS1;
           else
                   bedroomsRent1 = 0;
       }   
   }
   private class MealsListener implements ItemListener
   {
       public void itemStateChanged(ItemEvent e)
       {
           Object source = e.getItem();
   if(source == jrbtnYes1)
                     mealsCost1 = MEALS_1;
           else if(source == jrbtnNo1)
                     mealsCost1 = 0;
           else
                     mealsCost1= 0;
       }   
   }

  
}