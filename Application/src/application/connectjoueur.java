
package application;


import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.*;


public class connectjoueur extends javax.swing.JFrame {
    
    static Socket s;
   static DataInputStream ins;
   static DataOutputStream  outs;

          
    public connectjoueur() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Myanmar Text", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("Bienvenue à Notre Jeu");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "", "", "", "", "", "", ""
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("commencer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }


        });

        jButton2.setText("Quitter");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }

        });


        jButton3.setText("V");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        

        jButton4.setText("V");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("V");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("V");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("V");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("V");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("V");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jButton2))
        );

        pack();
    }// </editor-fold>                        

    
     private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {
       System.out.println("Tu as clique sur le bouton 'QUITTER' !! ^_^");
    }

          @SuppressWarnings("UseSpecificCatch")
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
    	
    	try {
            @SuppressWarnings("LocalVariableHidesMemberVariable")
    	String s= "Quitter";
        outs.writeUTF(s);
        outs.flush();
    	}
    	
    	catch(Exception e) 
    	{
    		System.out.println(e);
    	}
    	System.exit(0);
    }

    
   
   

protected void commencer ()
{
	  double jo;
      int joueur;
       
       nbTours =0;
       nbpions = 42;
      
      jo=Math.random();
          System.out.println(jo);
     
      if(jo >= 0.5)
      {
          joueur = 1;
          pions ="N";
          JOptionPane.showMessageDialog(null, "vous allez jouer avec le jeton N");
      }
      else
      {
          joueur = 2;
          pions ="R";
          JOptionPane.showMessageDialog(null, "vous allez jouer avec le jeton R");
          
          
      }
      jButton3.setEnabled(true);
      jButton4.setEnabled(true);
      jButton5.setEnabled(true);
      jButton6.setEnabled(true);
      jButton7.setEnabled(true);
      jButton8.setEnabled(true);
      jButton9.setEnabled(true);
}
	










    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
    }


void verifeVerticale(int coll ,int i)
{ 
    int j=0;
do
{
	if ( pions==jTable1.getModel().getValueAt(i,coll) )
	{
      j++;
      i++;
	}
	 
}while(i!=i+4);
 if(j==4)
 {
	 JOptionPane.showMessageDialog(null, "le joueur portant la couleur "+pions +"a gagne");
 }
 else
 {
	 verifeVerticale(coll,i-2) ;
 }
}
int Verticale(int k)
{
@SuppressWarnings("UnusedAssignment")
int a1=0; // compter le nombre porte le mème jeton le cas d'arret si on trouve 4 pion de mème couleur R ou N 
@SuppressWarnings("UnusedAssignment")
int i=0;
@SuppressWarnings("LocalVariableHidesMemberVariable")
int j;
System.out.println("verification de sense verticale ");
for (i=0;i<3;i++)
{
	a1=0;
	System.out.println("entrer dans la premier boucle for de verticle :i " +i);
	
		for (j=i; j<(i+4) ; j++)
		{
			
			System.out.println("enter dans la deuxiéme boucle for de verticle : i= "+i + "j= "+j);
			System.out.println(pions);


				if (jTable1.getModel().getValueAt(j,k) == pions)
				{
					System.out.println("dans la boucle if");

					a1++;
					System.out.println("a1 = " +a1);

				}
				else 
				{
					j=100;
					
				}
	
	
		}
	if (a1== 4)
	{
		return 1;
	}

}



 return (0);
}

/***********************************************************************/
int Diagonal1(int ligne , int col) // diagonale droite vers le bas 
{
	int a1=1;
	int i=0;
	int j=0;
	System.out.println("droite bas");

	for (i= ligne+1 , j= col+1 ; ((i<ligne+4)&& i<6) && ((j<col+4) && j<7)  ; i++,j++)
	{
		if (jTable1.getModel().getValueAt(i,j) == pions)
		{
		
			a1++;
			System.out.println("a1 = " +a1);

		}
	}
	if (a1==4)
	{
		System.out.println("Droite en bas");

		return 1;
	}
	return 0;
}
/************************************************************************/
int Diagonal2(int ligne , int col) // diagonale droite vers l'haut 
{
	int a1=1;
        @SuppressWarnings("UnusedAssignment")
	int i=0;
        @SuppressWarnings({"LocalVariableHidesMemberVariable", "UnusedAssignment"})
	int j=0;
	System.out.println("droite haut");

	
	for (i= ligne-1 , j= col+1 ; ((i>ligne-4)&&i>(-1))&& ((j<col+4)&& j<7) ; i--,j++)
	{
		if (jTable1.getModel().getValueAt(i,j) == pions)
		{
		
			a1++;
			System.out.println("a1 = " +a1);

		}
	}
	if (a1==4)
	{
		System.out.println("Droite en haut");

		return 1;
	}
	return 0;
}

/***********************************************************************/

int Diagonal4(int ligne , int col) // diagonal gauche vers l'haut
{
	int a1=1;
	int i=0;
	int j=0;
	System.out.println("gauche haut");

	
	for (i= ligne-1 , j= col-1 ; (i>(-1)&& j>(-1) ); i--,j--)
	{
		if (jTable1.getModel().getValueAt(i,j) == pions)
		{
		
			a1++;
			System.out.println("a1 = " +a1);

		}
	}
	if (a1==4)
	{
		System.out.println("Gauche en haut");

		return 1;
	}
	return 0;
}

/***********************************************************************/





int Diagonal3(int ligne , int col)// a gauche en bas
{
	int a1=1;
	int i=0;
	int j=0;
	System.out.println("Gauche bas");

	for (i= ligne+1 , j= col-1 ; ((i<ligne+4)&&i<6)&& j>(-1) ; i++,j--)
	{
		if (jTable1.getModel().getValueAt(i,j) == pions)
		{
		
			a1++;
			System.out.println("a1 = " +a1);

		}
	}
	if (a1==4)
	{
		System.out.println("Gauche en bas");

		return 1;
	}
	return 0;
}


/***********************************************************************/
int Horizontale(int k)
{
int a1=0;
int i=0;
int j;
System.out.println("entrer dans Horizontale");
for (i=0;i<4;i++)
{
	a1=0;
	System.out.println("enter dans la première  boucle for de horizontale i = " +i);
	
		for (j=i; j<(i+4) ; j++)
		{
			
			System.out.println("enter dans la deuxiéme boucle for de horizontale i= "+i + "j= "+j);
			System.out.println(pions);


				if (jTable1.getModel().getValueAt(k,j) == pions)
				{
					System.out.println("enter dans le if de horizontale ");

					a1++;
					System.out.println("a1 = " +a1);

				}
				else 
				{
					j=100;
					
				}
	
	
		}
	if (a1== 4)
	{
		System.out.println("Horizontale");
		return 1;
	}

}



 return (0);
}



    
    int affectation(int col)
    { int b=0;
    int d=0;
    	//int k=0;
    
        System.out.println("enter dans la methode affectation ");
    	int i=0;
    	int a=0;
    	int e=0;
    	int f=0;
    	int g=0;
    	Object c ;
    	for(i=5 ; i>=0 ; i--)
    	{
    		c = jTable1.getModel().getValueAt(i,col) ;
    		 if ( c == null)
    	      {
    	      jTable1.setValueAt(pions,i,col);
              //verifeVerticale(coll,k);
    	     if(nbTours >= 6)
    	     {
    	      a=Horizontale(i);
    	      b=Verticale(col);
    	      d=Diagonal1( i, col);
    	      e=Diagonal2(i , col);
    	      f=Diagonal3(i , col);
    	      g=Diagonal4(i,col);
    	     
    	     if ( a==1 || b==1 || d==1 || e==1 || f==1 || g==1)
    	     {
    	    	 if (pions =="R")
    	    	 {
    	    		 
    	    		 JOptionPane.showMessageDialog(null, "**FELICITAION** \n PLAYER 1  "); 
    	    		Quitter jf = new Quitter(this);
    	    		 jf.setVisible(true);
    	    		
    	    	 }
    	    	 else {
    	    		 JOptionPane.showMessageDialog(null, "**FELICITAION** \n PLAYER 2 "); 
    	    		 Quitter jf = new Quitter (this);
    	    		 jf.setVisible(true);
    	    		
    	    	 }
    	    	
    	     }
    	     }
    	    
    	      colonne=col;
    	      ligne=i;
    	      System.out.println("colonne:"+ colonne +"\n "+ "ligne:"+ligne +"\n"+ "jeton:" + pions+"\n");
    	      p=pions;
              if(pions == "R")
              { 
                  pions="N";
                  
              }
              else {
                  pions="R";
              }
    	      nbTours++;
    	      nbpions--;
    	      if (nbpions == 0 || nbTours ==42)
    	      {
    	    	  JOptionPane.showMessageDialog(null, "LA PARTIE EST FINIE EN EGALITE   "); 
    	      }
    	
              return(0);
    	      }
    	}
        
    	return(1);
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
  int a;
  a = affectation(0);
  if (a == 0)
  {
      System.out.println("REUSSIE");
      try
      {
    String s= p+"/"+ligne+"/"+colonne;
    System.out.println("bouton: "+s);
    outs.writeUTF("0");
    outs.flush();
      }
      catch(Exception e)
      {
    	  
      }
  }
  if (jTable1.getModel().getValueAt(0, 0) != null)
  {
	  jButton4.setEnabled(false);
  }
  
  
  
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
int a;
  a = affectation(2);
  if (a == 0)
  {
      System.out.println("REUSSIE");
      try
      {
    String s= p+"/"+ligne+"/"+colonne;
    System.out.println("bouton: "+s);

    outs.writeUTF("2");
    outs.flush();

      }
      catch(Exception e)
      {
    	  
      }
    
  }
  if (jTable1.getModel().getValueAt(0, 2) != null)
  {
	  jButton6.setEnabled(false);
  }
  
  
  
  // TODO add your handling code here:
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
     int a;
  a = affectation(3);
  if (a == 0)
  {
      System.out.println("REUSSIE");
      try
      {
    String s= p+"/"+ligne+"/"+colonne;
    System.out.println("bouton: "+s);

    outs.writeUTF("3");
    outs.flush();

      }
      catch(Exception e)
      {
    	  
      }
  }
  if (jTable1.getModel().getValueAt(0, 3) != null)
  {
	  jButton7.setEnabled(false);
  }
  
  
  
  
  // TODO add your handling code here:
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        int a;
  a = affectation(1);
  if (a == 0)
  {
      System.out.println("REUSSIE");
      try
      {
    String s= p+"/"+ligne+"/"+colonne;
    System.out.println("bouton: "+s);

    outs.writeUTF("1");
    outs.flush();

      }
      catch(Exception e)
      {
    	  
      }
  }
  if (jTable1.getModel().getValueAt(0, 1) != null)
  {
	  jButton5.setEnabled(false);
  }
  
  
  
  
    }

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
int a;
  a = affectation(4);
  if (a == 0)
  {
      System.out.println("REUSSIE");
      try
      {
    String s= p+"/"+ligne+"/"+colonne;
    System.out.println("bouton: "+s);

    outs.writeUTF("4");
    System.out.println("bouton: "+s);
    outs.flush();

      }
      catch(Exception e)
      {
    	  
      }
  } 
  if (jTable1.getModel().getValueAt(0, 4) != null)
  {
	  jButton8.setEnabled(false);
  }
  
  
  
  
  
  // TODO add your handling code here:
    }

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
int a;
  a = affectation(5);
  if (a == 0)
  {
      System.out.println("REUSSIE");
      try
      {
    String s= p+"/"+ligne+"/"+colonne;
    System.out.println("bouton: "+s);

    outs.writeUTF("5");
    outs.flush();

      }
      catch(Exception e)
      {
    	  
      }
  } 
  
  if (jTable1.getModel().getValueAt(0, 5) != null)
  {
	  jButton9.setEnabled(false);
  }
  
  // TODO add your handling code here:
    }

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
int a;
  a = affectation(6);
  if (a == 0)
  {
      System.out.println("REUSSIE");
      try
      {
    String s= p+"/"+ligne+"/"+colonne;
    System.out.println("bouton: "+s);

    outs.writeUTF("6");
    System.out.println("dout:  "+outs.toString());

   
      }
      catch(Exception e)
      {
    	  
      }
  }
  
  if (jTable1.getModel().getValueAt(0, 6) != null)
  {
	  jButton6.setEnabled(false);
  }
  
  // TODO add your handling code here:
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {  //commencer
         commencer();
         try {
        	 outs.writeUTF("commencer/"+pions);
         } catch (Exception e)
         {
        	 System.out.println(e);
         }
    }
     

    /**
     * @param args the command line arguments
     */
    
   int nbTours;
   int nbpions;
   public static String pions=""; 
   public String p="";
    public static int colonne;
    public int ligne;

  



    // Variables declaration - do not modify
    private static javax.swing.JButton jButton1;
    private static javax.swing.JButton jButton2;
    private static javax.swing.JButton jButton3;
    private static javax.swing.JButton jButton4;
    private static javax.swing.JButton jButton5;
    private static javax.swing.JButton jButton6;
    private static javax.swing.JButton jButton7;
    private static javax.swing.JButton jButton8;
    private static javax.swing.JButton jButton9;
 
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    protected javax.swing.JTable jTable1;
  
    // End of variables declaration
    public static void main(String args[])
    {  
    	 
    	 try {
             for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                 if ("Nimbus".equals(info.getName())) {
                     javax.swing.UIManager.setLookAndFeel(info.getClassName());
                     break;
                 }
             }
         } catch (ClassNotFoundException ex) {
             java.util.logging.Logger.getLogger(connectjoueur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         } catch (InstantiationException ex) {
             java.util.logging.Logger.getLogger(connectjoueur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         } catch (IllegalAccessException ex) {
             java.util.logging.Logger.getLogger(connectjoueur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         } catch (javax.swing.UnsupportedLookAndFeelException ex) {
             java.util.logging.Logger.getLogger(connectjoueur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         }
         //</editor-fold>
         connectjoueur fen= new connectjoueur();

         /* Create and display the form */
         java.awt.EventQueue.invokeLater(new Runnable() {
             public void run() {
                
             		   fen.setVisible(true);
             		  fen.setResizable(false);
             		   
             		   
             }
         });
     
    	
    	try {
			s= new Socket("localhost",1555);
			
			
			 ins = new DataInputStream(s.getInputStream());
     		 outs= new DataOutputStream(s.getOutputStream());
     		 
     		 String msg ="";
     		 
     		 while(!msg.equals("Quitter"))
     		 {
     		   msg = (String)ins.readUTF();	
     		   switch(msg.toString()) 
     		   {
     		   case "commencer/N":
     		   {
     		      jButton3.setEnabled(false);
     		      jButton4.setEnabled(false);
     		      jButton5.setEnabled(false);
     		      jButton6.setEnabled(false);
     		      jButton7.setEnabled(false);
     		      jButton8.setEnabled(false);
     		      jButton9.setEnabled(false);
     		      jButton2.setEnabled(false);
     		      jButton1.setEnabled(false);
     		      pions="N";
     		   }
     		   break;
     		   
     		   case "commencer/R":
    		   {
    		      jButton3.setEnabled(false);
    		      jButton4.setEnabled(false);
    		      jButton5.setEnabled(false);
    		      jButton6.setEnabled(false);
    		      jButton7.setEnabled(false);
    		      jButton8.setEnabled(false);
    		      jButton9.setEnabled(false);
    		      jButton2.setEnabled(false);
    		      jButton1.setEnabled(false);
    		      pions="R";
    		   }
    		   break;
    		   
     		   case "0": 
     		  {

     			 int cl=Integer.parseInt(msg);
     			  fen.affectation(cl);
     		  } break;
     		  
     		  case "1": 
     		  {
     			 int cl=Integer.parseInt(msg);
    			  fen.affectation(cl);
     			 
     		  } break;
     		  
     		 case "2": 
    		  {
    			 int cl=Integer.parseInt(msg);
   			  fen.affectation(cl);
    			 
    		  } break;
    		  
     		 case "3": 
    		  {
    			 int cl=Integer.parseInt(msg);
   			  fen.affectation(cl);
    			 
    		  } break;
    		  
     		 case "4": 
    		  {
    			 int cl=Integer.parseInt(msg);
   			  fen.affectation(cl);
    			 
    		  } break;
    		  
     		 case "5": 
    		  {
    			 int cl=Integer.parseInt(msg);
   			  fen.affectation(cl);
    			 
    		  } break;
    		  
     		 case "6": 
    		  {
    			 int cl=Integer.parseInt(msg);
   			  fen.affectation(cl);
    			 
    		  } break;
     		  
     		 case"bloqué":
     		 {
     		      jButton3.setEnabled(false);
  		      jButton4.setEnabled(false);
  		      jButton5.setEnabled(false);
  		      jButton6.setEnabled(false);
  		      jButton7.setEnabled(false);
  		      jButton8.setEnabled(false);
  		      jButton9.setEnabled(false);
  		      jButton2.setEnabled(false);
  		      jButton1.setEnabled(false);
     		 }break;
     		 
     		 case "débloqué":
     		 {
     		      jButton3.setEnabled(true);
  		      jButton4.setEnabled(true);
  		      jButton5.setEnabled(true);
  		      jButton6.setEnabled(true);
  		      jButton7.setEnabled(true);
  		      jButton8.setEnabled(true);
  		      jButton9.setEnabled(true);
  		      jButton2.setEnabled(true);
  		      jButton1.setEnabled(false);
     		 } break;
     		 case "Quitter":
     		 {
	    		 JOptionPane.showMessageDialog(null, " FELICITATION!! \n l'autre joueur  a quitte \n vous avez ganez  "); 

     		 }break;
     		 
     		  
     		   
     		 }
     		   System.out.println("arriver part de serveur "+msg);

     		 }
			 
    	}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
     }
    }
    

