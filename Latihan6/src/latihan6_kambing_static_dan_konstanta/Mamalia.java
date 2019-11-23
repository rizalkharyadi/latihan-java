/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan6_kambing_static_dan_konstanta;

/**
 *
 * @author 
 * Nama : rIZAL kHARYADI
 * KELAS : TI-1C
 * NIM : A2.1900156
 */
public class Mamalia {
        //variabel jumlahKambing dideklarasikan sebagai statik
        public static int jumlahKambing;
}
class KambingStatic{
    //NAMA_KAMBING sebagai konstanta
    public static final String NAMA_KAMBING = " MIDUN "; 
    
    public static void main(String[] args) {
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak " + Mamalia.jumlahKambing);
    }
}
