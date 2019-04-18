package jvacationrental;

	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;
	public class NewHome extends JFrame implements ItemListener
	{
	    
	//declare the house type button group and all its buttons
	final int aspenBox = 100000;
	final int brittanyBox = 120000;
	final int colonialBox = 180000;
	final int dartmoorBox = 250000;

	int totalPrice = 0;

	ButtonGroup homeGroup = new ButtonGroup();
	JCheckBox homeBox1 = new JCheckBox("Aspen " , false);
	JCheckBox homeBox2 = new JCheckBox("Brittany ", false);
	JCheckBox homeBox3 = new JCheckBox("Colonial ", false);
	JCheckBox homeBox4 = new JCheckBox("Dartmoor ", false);

	//declare the bedroom button group and all its buttons
	final int bedroomPrice2 = 21000;
	final int bedroomPrice3 = 31500;
	final int bedroomPrice4 = 42000;

	ButtonGroup bedroomGroup = new ButtonGroup();
	JCheckBox twobedroomBox = new JCheckBox("2 Bedrooms ", false);
	JCheckBox threebedroomBox = new JCheckBox("3 Bedrooms ", false);
	JCheckBox fourbedroomBox = new JCheckBox("4 Bedrooms ", false);

	//declare the garage type button group and all its buttons
	final int garageCars0 = 0;
	final int garageCars1 = 7775;
	final int garageCars2 = 15550;
	final int garageCars3 = 23325;

	ButtonGroup garageGroup = new ButtonGroup();
	JCheckBox zerocarBox = new JCheckBox("Zero Cars ", false);
	JCheckBox onecarBox = new JCheckBox("One Car ", false);
	JCheckBox twocarsBox = new JCheckBox("Two Cars ", false);
	JCheckBox threecarsBox = new JCheckBox("Three Cars ", false);


	//Labels
	JLabel homeOptionLabel = new JLabel("Select the Desired Model:");
	JLabel homeOptionLabel0 = new JLabel("");
	JLabel ePrice = new JLabel("The Price of Your Home Is: $" );

	JTextField totPrice = new JTextField(10);
	String output;

	//2nd Labels
	JLabel bedroomOptionLabel = new JLabel("Select the Desired Number of Rooms:");
	JLabel bedroomOptionLabel0 = new JLabel("");

	//3rd Labels
	JLabel garageoptionLabel = new JLabel("Select the Desired Garage:");
	JLabel garageoptionLabel0 = new JLabel("");

	public NewHome()
	{
	super("New Home Build");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JPanel pane = new JPanel();
	pane.add(homeOptionLabel);
	pane.add(homeOptionLabel0);
	pane.add(homeBox1);
	pane.add(homeBox2);
	pane.add(homeBox3);
	pane.add(homeBox4);
	ButtonGroup homeGroup = new ButtonGroup();
	homeGroup.add(homeBox1);
	homeGroup.add(homeBox2);
	homeGroup.add(homeBox3);
	homeGroup.add(homeBox4);



	homeBox1.addItemListener(this);
	homeBox2.addItemListener(this);
	homeBox3.addItemListener(this);
	homeBox4.addItemListener(this);
	setContentPane(pane);


	JPanel secondPane = new JPanel();
	pane.add(bedroomOptionLabel);
	pane.add(bedroomOptionLabel0);
	pane.add(twobedroomBox);
	pane.add(threebedroomBox);
	pane.add(fourbedroomBox);
	ButtonGroup bedroomGroup = new ButtonGroup();
	bedroomGroup.add(twobedroomBox);
	bedroomGroup.add(threebedroomBox);
	bedroomGroup.add(fourbedroomBox);


	twobedroomBox.addItemListener(this);
	threebedroomBox.addItemListener(this);
	fourbedroomBox.addItemListener(this);
	setContentPane(pane);


	JPanel thirdPane = new JPanel();
	pane.add(garageoptionLabel);
	pane.add(garageoptionLabel0);
	pane.add(zerocarBox);
	pane.add(onecarBox);
	pane.add(twocarsBox);
	pane.add(threecarsBox);
	ButtonGroup garageGroup = new ButtonGroup();
	garageGroup.add(zerocarBox);
	garageGroup.add(onecarBox);
	garageGroup.add(twocarsBox);
	garageGroup.add(threecarsBox);

	zerocarBox.addItemListener(this);
	onecarBox.addItemListener(this);
	twocarsBox.addItemListener(this);
	threecarsBox.addItemListener(this);
	setContentPane(pane);

	pane.add(ePrice);
	pane.add(totPrice);

	}

	public static void main(String[] arguments)
	{
	JFrame aFrame = new NewHome();
	aFrame.setSize(650,200);
	aFrame.setVisible(true);
	}

	public void itemStateChanged(ItemEvent event)
	{
	    //get source
	    Object NHsource = event.getItem();
	    
	    //if homeBox had bee clicked
	 if(NHsource == homeBox1)
	         {
	             int select = event.getStateChange();
	             //homeBox is selected
	             if(select == ItemEvent.SELECTED)
	             {
	                 //add the homeBox1 to total price
	                 totalPrice += aspenBox;
	             }
	             else
	             {
	                 //homeBox has been deselected
	                 if(select == ItemEvent.DESELECTED)
	                 {
	                     //subtract homeBox from total price
	                     totalPrice -= aspenBox;
	                 }
	             }
	 
	 //update totalPrice into frame
	 output = "" + totalPrice;
	 totPrice.setText(output);
	}

	//if brittanyBox is selected
	if(NHsource == homeBox2)
	{
	    int select = event.getStateChange();
	    if(select == ItemEvent.SELECTED)
	    {
	        totalPrice += brittanyBox;
	    }
	    else
	    {
	        if(select == ItemEvent.DESELECTED)
	        {
	            totalPrice -= brittanyBox;
	        }
	    }
	    output = "" + totalPrice;
	    totPrice.setText(output);
	}

	//if colonialBox is selected
	if(NHsource == homeBox3)
	{
	    int select = event.getStateChange();
	    if(select == ItemEvent.SELECTED)
	    {
	        totalPrice += colonialBox;
	    }
	    else
	    {
	        if(select == ItemEvent.DESELECTED)
	        {
	            totalPrice -= colonialBox;
	        }
	    }
	    output = "" + totalPrice;
	    totPrice.setText(output);
	}

	//if dartmoorBox is selected
	if(NHsource == homeBox4)
	{
	    int select = event.getStateChange();
	    if(select == ItemEvent.SELECTED)
	    {
	        totalPrice += dartmoorBox;
	    }
	    else
	    {
	        if(select == ItemEvent.DESELECTED)
	        {
	            totalPrice -= dartmoorBox;
	        }
	    }
	    output = "" + totalPrice;
	    totPrice.setText(output);
	}

	//if bedroomPrice2 is selected
	if(NHsource == twobedroomBox)
	{
	    int select = event.getStateChange();
	    if(select == ItemEvent.SELECTED)
	    {
	        totalPrice += bedroomPrice2;
	    }
	    else
	    {
	        if(select == ItemEvent.DESELECTED)
	        {
	            totalPrice -= bedroomPrice2;
	        }
	    }
	    output = "" + totalPrice;
	    totPrice.setText(output);
	}

	//if bedroomPrice3 is selected
	if(NHsource == threebedroomBox)
	{
	    int select = event.getStateChange();
	    if(select == ItemEvent.SELECTED)
	    {
	        totalPrice += bedroomPrice3;
	    }
	    else
	    {
	        if(select == ItemEvent.DESELECTED)
	        {
	            totalPrice -= bedroomPrice3;
	        }
	    }
	    output = "" + totalPrice;
	    totPrice.setText(output);
	}
	//if bedroomPrice4 is selected
	if(NHsource == fourbedroomBox)
	{
	    int select = event.getStateChange();
	    if(select == ItemEvent.SELECTED)
	    {
	        totalPrice += bedroomPrice4;
	    }
	    else
	    {
	        if(select == ItemEvent.DESELECTED)
	        {
	            totalPrice -= bedroomPrice4;
	        }
	    }
	    output = "" + totalPrice;
	    totPrice.setText(output);
	}

	//if garageCars0 is selected
	if(NHsource == zerocarBox)
	{
	    int select = event.getStateChange();
	    if(select == ItemEvent.SELECTED)
	    {
	        totalPrice += garageCars0;
	    }
	    else
	    {
	        if(select == ItemEvent.DESELECTED)
	        {
	            totalPrice -= garageCars0;
	        }
	    }
	    output = "" + totalPrice;
	    totPrice.setText(output);
	}

	//if garageCars1 is selected
	if(NHsource == onecarBox)
	{
	    int select = event.getStateChange();
	    if(select == ItemEvent.SELECTED)
	    {
	        totalPrice += garageCars1;
	    }
	    else
	    {
	        if(select == ItemEvent.DESELECTED)
	        {
	            totalPrice -= garageCars1;
	        }
	    }
	    output = "" + totalPrice;
	    totPrice.setText(output);
	}

	//if garageCars2 is selected
	if(NHsource == twocarsBox)
	{
	    int select = event.getStateChange();
	    if(select == ItemEvent.SELECTED)
	    {
	        totalPrice += garageCars2;
	    }
	    else
	    {
	        if(select == ItemEvent.DESELECTED)
	        {
	            totalPrice -= garageCars2;
	        }
	    }
	    output = "" + totalPrice;
	    totPrice.setText(output);
	}

	//if garagecars3 is selected
	if(NHsource == threecarsBox)
	{
	    int select = event.getStateChange();
	    if(select == ItemEvent.SELECTED)
	    {
	        totalPrice += garageCars3;
	    }
	    else
	    {
	        if(select == ItemEvent.DESELECTED)
	        {
	            totalPrice -= garageCars3;
	        }
	    }
	    output = "" + totalPrice;
	    totPrice.setText(output);
	}
	}
	}
