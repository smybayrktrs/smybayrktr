
package kütüphanesistemi;

import java.util.ArrayList;

public class KütüphaneSistemi {
    public static void main(String[] args) {
   ArrayList<Kitap> kitaplar = new ArrayList <> ();
   Kitap kitap1 = new Kitap ("Kardeşimin hikayesi ", 250 ," Zülfi Livaneli ", 2010) ;
   Roman roman1 = new Roman ("Tutunamayanlar ", 450 , " Sait faik abasıyanık ", 2001 , 1 ) ;
   Hikaye hikaye1 = new Hikaye ("Yalnız Efe ", 120 , " Ömer Seyfettin " , 1995 , " mücadele ") ;
   Kitap hikaye2= new Hikaye () ;
   Kitap roman2 = new Hikaye () ;
   System.out.println ("Kitap adı = " +hikaye1.getkitapAdı()) ;
   kitapYazdır(hikaye1) ;
   kitapYazdır (roman1) ;
   roman1.setyazar("oğuz Atay");
   kitapYazdır(roman1) ;
   kitapYazdır (kitap1) ;
   kitapYazdır (roman2) ;
   kitaplar.add(kitap1);
   kitaplar.add(roman1);
   kitaplar.add(hikaye1);  //Kitap ekler 
   kitaplar.remove (kitap1);  //Kitap siler
   kitaplar.add(hikaye2) ;
   kitaplar.add (roman2) ;
   System.out.println (kitaplar.size()) ;  //Kaç tane kitap olduğunu gösterir.
   kitap1.toString();
   roman2.toString();
   kitap1.kitapOku();
   hikaye1.kitabıSeslendir();
   hikaye2.toString() ;
   roman1.kitapOku();   }
private static void kitapYazdır (Kitap kitap) {
    kitap.kitapYazdır () ; }  //Polymorphism örneği
}  
class Kitap {
private String kitapAdı ;
private int sayfaSayısı ;  //kapsülleme
private String yazar ;
private int basımYılı ;
public Kitap () {  //contractur (yapıcı) metoda varsayılan değerin atanması
    this.kitapAdı = "Kitap adı henüz atanmadı." ;
    this.basımYılı = 0 ;
    this.sayfaSayısı = 0;
    this.yazar = " Yazar henüz atanmadı. " ; }
public Kitap (String kitapAdı, int sayfaSayısı, String yazar, int basımYılı ) { //yapıcı metod
    this.sayfaSayısı=sayfaSayısı ;
    this.yazar=yazar ;
    this.basımYılı=basımYılı ;
    this.kitapAdı=kitapAdı ;   }
public String getkitapAdı () {   
    return kitapAdı ; }
public void setkitapAdı (String kitapAdı) {
    this.kitapAdı =kitapAdı ; }
public int getsayfaSayısı () {
    return sayfaSayısı ; }
public void setsayfaSayısı (int sayfaSayısı) {
    this.sayfaSayısı = sayfaSayısı ; }
public String getyazar () {
    return yazar ; }
public void setyazar (String yazar) {
    this.yazar =yazar ; }
public int getbasımYılı () {
    return basımYılı ; }
public void setbasımYılı (int basımYılı) {
    this.basımYılı=basımYılı ; }
public void kitapYazdır () {
    System.out.println (kitapAdı +"kitabı " + sayfaSayısı +" sayfalı " + basımYılı + " yılında basılmış " + yazar + " 'in kitabıdır.") ; }
public void kitapOku () {
    System.out.println ("Kitap seslendiriliyor...") ;  }
@Override
    public String toString () {
    return "Kitabın adı = " +getkitapAdı ()  ; }
}
class Roman extends Kitap {  //kalıtım (miraslama)
    private int ciltSayısı ;
    public int getciltSayısı () {
    return ciltSayısı ; }
    public void setciltSayısı (int ciltSayısı) {
    this.ciltSayısı=ciltSayısı ; }
    public Roman () {
    }
    public Roman (String kitapAdı, int sayfaSayısı, String yazar, int basımYılı,int ciltSayısı) { 
     super (kitapAdı, sayfaSayısı, yazar, basımYılı) ;
     this.ciltSayısı =ciltSayısı ;  }
    @Override
    public void kitapYazdır () { //metod
    System.out.println (getkitapAdı() + " kitabı" + getsayfaSayısı()+" sayfalı" + getbasımYılı()+ " yılında basılmış" +ciltSayısı+" ciltli"+ getyazar()+" 'ın kitabıdır.") ; }       
    @Override
    public String toString () {  
    return "roman türündeki kitabın adı = " +getkitapAdı ()  ; }
    }
class Hikaye extends Kitap {
    private String konu ;
    public String getkonu () {
    return konu ; }
    public void setkonu (String konu) {
    this.konu = konu ; }
    public Hikaye () {
     }
    public Hikaye (String kitapAdı, int sayfaSayısı, String yazar, int basımYılı,String konu) { 
    super (kitapAdı, sayfaSayısı, yazar, basımYılı) ;
    this.konu = konu  ;  }
    public void kitabıSeslendir () {
        System.out.println ("Hikaye seslendiriliyor.") ;
    }
    @Override
    public void kitapYazdır () {
    System.out.println (getkitapAdı() + " kitabı" + getsayfaSayısı()+" sayfalı" + getbasımYılı()+ " yılında basılmış" + konu + "konulu "+ getyazar()+" 'in kitabıdır.") ; }       
    @Override
    public String toString () {
    return "hikaye türündeki kitabın adı = " +getkitapAdı ()  ; }
}



