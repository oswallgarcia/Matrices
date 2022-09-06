import java.awt.event.*;
import javax.swing.*;



public class Matrices extends JFrame implements ActionListener {

  private JTextField f1,f2,f3,f4,f5,f6,f7,f8,f9;
  private JTextField f10,f11,f12,f13,f14,f15,f16,f17,f18;
  private JTextField f19,f20,f21,f22,f23,f24,f25,f26,f27;
  
  
  JButton b1,b2,b3,b4,b5;



  public Matrices (){


   setLayout(null);

   //botones de las operaciones 

   b1 = new JButton("+");
   b1.setBounds(10,110,90,30);
   add(b1);
   b1.addActionListener(this);

   b2 = new JButton("-");
   b2.setBounds(10,150,90,30);
   add(b2);
   b2.addActionListener(this);

   b3 = new JButton("*");
   b3.setBounds(10,190,90,30);
   add(b3);
   b3.addActionListener(this);

   b4 = new JButton("Exit");
   b4.setBounds(10,230,90,30);
   add(b4);
   b4.addActionListener(this);
   
   b5 = new JButton("Limpiar");
   b5.setBounds(290,230,90,30);
   add(b5);
   b5.addActionListener(this);





   //primera Matriz

   //primera fila de los JTextField


   f1 = new JTextField("");
   f1.setBounds(10,10,30,20);
   add(f1);

   f2 = new JTextField("");
   f2.setBounds(50,10,30,20);
   add(f2);

   f3 = new JTextField("");
   f3.setBounds(90,10,30,20);
   add(f3);

   //segunda fila de los JTextField


   f4 = new JTextField("");
   f4.setBounds(10,40,30,20);
   add(f4);

   f5 = new JTextField("");
   f5.setBounds(50,40,30,20);
   add(f5);

   f6 = new JTextField("");
   f6.setBounds(90,40,30,20);
   add(f6);


   //Tercera fila de los JTextField

   
   f7 = new JTextField("");
   f7.setBounds(10,70,30,20);
   add(f7);

   f8 = new JTextField("");
   f8.setBounds(50,70,30,20);
   add(f8);

   f9 = new JTextField("");
   f9.setBounds(90,70,30,20);
   add(f9);


  //Segunda Matriz

  //primera fila de la segunda Matriz 


   f10 = new JTextField("");
   f10.setBounds(270,10,30,20);
   add(f10);

   f11 = new JTextField("");
   f11.setBounds(310,10,30,20);
   add(f11);

   f12 = new JTextField("");
   f12.setBounds(350,10,30,20);
   add(f12);

  //segunda fila de la segunda Matriz


   f13 = new JTextField("");
   f13.setBounds(270,40,30,20);
   add(f13);

   f14 = new JTextField("");
   f14.setBounds(310,40,30,20);
   add(f14);

   f15 = new JTextField("");
   f15.setBounds(350,40,30,20);
   add(f15);

  //tecera fila de la segunda Matriz

  
   f16 = new JTextField("");
   f16.setBounds(270,70,30,20);
   add(f16);

   f17 = new JTextField("");
   f17.setBounds(310,70,30,20);
   add(f17);

   f18 = new JTextField("");
   f18.setBounds(350,70,30,20);
   add(f18);
  
   //Tercera Matriz 

   //Primera fila de la Tercera Matriz 

 
   f19 = new JTextField("");
   f19.setBounds(150,110,30,20);
   add(f19);

   f20 = new JTextField("");
   f20.setBounds(190,110,30,20);
   add(f20);

   f21 = new JTextField("");
   f21.setBounds(230,110,30,20);
   add(f21);
  


   //Segunda fila de la tercera Matriz
   
   
   f22 = new JTextField("");
   f22.setBounds(150,140,30,20);
   add(f22);

   f23 = new JTextField("");
   f23.setBounds(190,140,30,20);
   add(f23);

   f24 = new JTextField("");
   f24.setBounds(230,140,30,20);
   add(f24);
   
   
   //Tercera fila de la tercera matriz
   
   
   f25 = new JTextField("");
   f25.setBounds(150,170,30,20);
   add(f25);

   f26 = new JTextField("");
   f26.setBounds(190,170,30,20);
   add(f26);

   f27 = new JTextField("");
   f27.setBounds(230,170,30,20);
   add(f27);


  }
  
  
  public void actionPerformed(ActionEvent e){
  
      //Metodo para sumar
  if(e.getSource() == b1){
      
      
      //valores de la primera matriz
      
      int r1,r2,r3,r4,r5,r6,r7,r8,r9;
  
      String v1 = f1.getText().toString();
      String v2 = f2.getText().toString();
      String v3 = f3.getText().toString();
      String v4 = f4.getText().toString();
      String v5 = f5.getText().toString();
      String v6 = f6.getText().toString();
      String v7 = f7.getText().toString();
      String v8 = f8.getText().toString();
      String v9 = f9.getText().toString();
      
      int valor1 = Integer.parseInt(v1);
      int valor2 = Integer.parseInt(v2);
      int valor3 = Integer.parseInt(v3);
      int valor4 = Integer.parseInt(v4);
      int valor5 = Integer.parseInt(v5);
      int valor6 = Integer.parseInt(v6);
      int valor7 = Integer.parseInt(v7);
      int valor8 = Integer.parseInt(v8);
      int valor9 = Integer.parseInt(v9);
  
  
      //valores de la segunda matriz
      
      
      String v10 = f10.getText().toString();
      String v11 = f11.getText().toString();
      String v12 = f12.getText().toString();
      String v13 = f13.getText().toString();
      String v14 = f14.getText().toString();
      String v15 = f15.getText().toString();
      String v16 = f16.getText().toString();
      String v17 = f17.getText().toString();
      String v18 = f18.getText().toString();
      
      int valor10 = Integer.parseInt(v10);
      int valor11 = Integer.parseInt(v11);
      int valor12 = Integer.parseInt(v12);
      int valor13 = Integer.parseInt(v13);
      int valor14 = Integer.parseInt(v14);
      int valor15 = Integer.parseInt(v15);
      int valor16 = Integer.parseInt(v16);
      int valor17 = Integer.parseInt(v17);
      int valor18 = Integer.parseInt(v18);
      
      
      //Operaciones de la suma

      r1 = valor1 + valor10;
      r2 = valor2 + valor11;
      r3 = valor3 + valor12;
      r4 = valor4 + valor13;
      r5 = valor5 + valor14;
      r6 = valor6 + valor15;
      r7 = valor7 + valor16;
      r8 = valor8 + valor17;
      r9 = valor9 + valor18;
      
      
      String e1 = String.valueOf(r1);
      String e2 = String.valueOf(r2);
      String e3 = String.valueOf(r3);
      String e4 = String.valueOf(r4);
      String e5 = String.valueOf(r5);
      String e6 = String.valueOf(r6);
      String e7 = String.valueOf(r7);
      String e8 = String.valueOf(r8);
      String e9 = String.valueOf(r9);
      
      
      f19.setText(e1);
      f20.setText(e2);
      f21.setText(e3);
      f22.setText(e4);
      f23.setText(e5);
      f24.setText(e6);
      f25.setText(e7);
      f26.setText(e8);
      f27.setText(e9);
     
      
     
      
     
  }
  
  //Metodo para restar
  
  if(e.getSource() == b2){
  
   //valores de la primera matriz
      
      int r1,r2,r3,r4,r5,r6,r7,r8,r9;
  
      String v1 = f1.getText().toString();
      String v2 = f2.getText().toString();
      String v3 = f3.getText().toString();
      String v4 = f4.getText().toString();
      String v5 = f5.getText().toString();
      String v6 = f6.getText().toString();
      String v7 = f7.getText().toString();
      String v8 = f8.getText().toString();
      String v9 = f9.getText().toString();
      
      int valor1 = Integer.parseInt(v1);
      int valor2 = Integer.parseInt(v2);
      int valor3 = Integer.parseInt(v3);
      int valor4 = Integer.parseInt(v4);
      int valor5 = Integer.parseInt(v5);
      int valor6 = Integer.parseInt(v6);
      int valor7 = Integer.parseInt(v7);
      int valor8 = Integer.parseInt(v8);
      int valor9 = Integer.parseInt(v9);
  
  
      //valores de la segunda matriz
      
      
      String v10 = f10.getText().toString();
      String v11 = f11.getText().toString();
      String v12 = f12.getText().toString();
      String v13 = f13.getText().toString();
      String v14 = f14.getText().toString();
      String v15 = f15.getText().toString();
      String v16 = f16.getText().toString();
      String v17 = f17.getText().toString();
      String v18 = f18.getText().toString();
      
      int valor10 = Integer.parseInt(v10);
      int valor11 = Integer.parseInt(v11);
      int valor12 = Integer.parseInt(v12);
      int valor13 = Integer.parseInt(v13);
      int valor14 = Integer.parseInt(v14);
      int valor15 = Integer.parseInt(v15);
      int valor16 = Integer.parseInt(v16);
      int valor17 = Integer.parseInt(v17);
      int valor18 = Integer.parseInt(v18);
      
      
      //Operaciones de la resta

      r1 = valor1 - valor10;
      r2 = valor2 - valor11;
      r3 = valor3 - valor12;
      r4 = valor4 - valor13;
      r5 = valor5 - valor14;
      r6 = valor6 - valor15;
      r7 = valor7 - valor16;
      r8 = valor8 - valor17;
      r9 = valor9 - valor18;
      
      
      String e1 = String.valueOf(r1);
      String e2 = String.valueOf(r2);
      String e3 = String.valueOf(r3);
      String e4 = String.valueOf(r4);
      String e5 = String.valueOf(r5);
      String e6 = String.valueOf(r6);
      String e7 = String.valueOf(r7);
      String e8 = String.valueOf(r8);
      String e9 = String.valueOf(r9);
      
      
      f19.setText(e1);
      f20.setText(e2);
      f21.setText(e3);
      f22.setText(e4);
      f23.setText(e5);
      f24.setText(e6);
      f25.setText(e7);
      f26.setText(e8);
      f27.setText(e9);
     
  
  
  
  }
  
   //Metodo para restar
  
  if(e.getSource() == b3){
  
   //valores de la primera matriz
      
      int r1,r2,r3,r4,r5,r6,r7,r8,r9;
  
      String v1 = f1.getText().toString();
      String v2 = f2.getText().toString();
      String v3 = f3.getText().toString();
      String v4 = f4.getText().toString();
      String v5 = f5.getText().toString();
      String v6 = f6.getText().toString();
      String v7 = f7.getText().toString();
      String v8 = f8.getText().toString();
      String v9 = f9.getText().toString();
      
      int valor1 = Integer.parseInt(v1);
      int valor2 = Integer.parseInt(v2);
      int valor3 = Integer.parseInt(v3);
      int valor4 = Integer.parseInt(v4);
      int valor5 = Integer.parseInt(v5);
      int valor6 = Integer.parseInt(v6);
      int valor7 = Integer.parseInt(v7);
      int valor8 = Integer.parseInt(v8);
      int valor9 = Integer.parseInt(v9);
  
  
      //valores de la segunda matriz
      
      
      String v10 = f10.getText().toString();
      String v11 = f11.getText().toString();
      String v12 = f12.getText().toString();
      String v13 = f13.getText().toString();
      String v14 = f14.getText().toString();
      String v15 = f15.getText().toString();
      String v16 = f16.getText().toString();
      String v17 = f17.getText().toString();
      String v18 = f18.getText().toString();
      
      int valor10 = Integer.parseInt(v10);
      int valor11 = Integer.parseInt(v11);
      int valor12 = Integer.parseInt(v12);
      int valor13 = Integer.parseInt(v13);
      int valor14 = Integer.parseInt(v14);
      int valor15 = Integer.parseInt(v15);
      int valor16 = Integer.parseInt(v16);
      int valor17 = Integer.parseInt(v17);
      int valor18 = Integer.parseInt(v18);
      
      
      //Operaciones de la resta

      r1 = valor1 * valor10;
      r2 = valor2 * valor11;
      r3 = valor3 * valor12;
      r4 = valor4 * valor13;
      r5 = valor5 * valor14;
      r6 = valor6 * valor15;
      r7 = valor7 * valor16;
      r8 = valor8 * valor17;
      r9 = valor9 * valor18;
      
      
      String e1 = String.valueOf(r1);
      String e2 = String.valueOf(r2);
      String e3 = String.valueOf(r3);
      String e4 = String.valueOf(r4);
      String e5 = String.valueOf(r5);
      String e6 = String.valueOf(r6);
      String e7 = String.valueOf(r7);
      String e8 = String.valueOf(r8);
      String e9 = String.valueOf(r9);
      
      
      f19.setText(e1);
      f20.setText(e2);
      f21.setText(e3);
      f22.setText(e4);
      f23.setText(e5);
      f24.setText(e6);
      f25.setText(e7);
      f26.setText(e8);
      f27.setText(e9);
     
  
  
  
  }
  
  
  if(e.getSource() == b4){
      
      System.exit(0);
  
  
  }
  
   if(e.getSource() == b5){
      
      f19.setText(null);
      f20.setText(null);
      f21.setText(null);
      f22.setText(null);
      f23.setText(null);
      f24.setText(null);
      f25.setText(null);
      f26.setText(null);
      f27.setText(null);
  
  
  }
  
  
  
  }
  
  
  
  
  
  
  
  
 
  
  
  
  
  

 public static void main (String args[]){

    Matrices alv = new Matrices();
    alv.setBounds(0,0,400,300);
    alv.setVisible(true);
    alv.setResizable(false);
    alv.setLocationRelativeTo(null);



}

}
    



    
    

