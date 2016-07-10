/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trascendfinder;

/**
 *
 * @author Linnea
 */
public class TrascendFinder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double piFind = 9.0;
        System.out.println(piRoot(piFind, 1));
        
        double eFind = 7.0;
        System.out.println(eRoot(eFind, 1));
    }
    
    static public double eRoot(double d, double n){
        double add = 0.5/n;
        double root = Math.pow(d, 0.5);
        //System.out.println("Root " + d + " --- " + root);
        if( root == Math.E){
            return d;
        }
        else{
            if(root < Math.E){
                n++;
                d += add;
                return eRoot(d, n);
            }
            else{
                n++;
                d -= add;
                return eRoot(d, n);
            }
        }
    }
    static public double piRoot(double d, double n){
        double add = 0.5 /n;
        double root = Math.pow(d, 0.5);
        //System.out.println("Root " + d + " --- " + root);
        if( root == Math.PI){
            return d;
        }
        else{
            if(root < Math.PI){
                n++;
                d += add;
                return piRoot(d, n);
            }
            else{
                n++;
                d -= add;
                return piRoot(d, n);
            }
        }
    }
}
