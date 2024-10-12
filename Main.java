//guess is it runtime or compile time polymorphism
class WondersOfWorld{  
  void location(){
System.out.println("Location is:");
}  
void year(){
System.out.println("Built in :");
}  
 
}  
class GizaPyramids extends WondersOfWorld {  
  void location(){
System.out.println("GizaPyramids is in Giza Necropolis, Egypt");
}  
void year(){
System.out.println("It was built in 2560 BC");
}  
  }
class GreatWallofChina extends WondersOfWorld {  
  void location(){
System.out.println("The Great Wall of China is in China");
}  
void year(){
System.out.println("It was built in 700 BC");
}  
  }
class Petra extends WondersOfWorld {  
  void location(){
System.out.println("Petra is in Ma'an, Jordan");
}  
void year(){
System.out.println("It was built in 312 BC");
}  
}

class Colosseum extends WondersOfWorld {
  void location() {
    System.out.println("Colosseum is in Rome, Italy");
  }

  void year() {
    System.out.println("It was built in 80 AD");
  }
}

class ChichénItzá extends WondersOfWorld {
  void location() {
    System.out.println("Chichén Itzá is in Yucatán, Mexico");
  }

  void year() {
    System.out.println("It was built in 600 AD");
  }
}

class MachuPicchu extends WondersOfWorld {
  void location() {
    System.out.println("Machu Picchu is in Cuzco Region, Peru");
  }

  void year() {
    System.out.println("It was built in 1450 AD");
  }
}

class TajMahal extends WondersOfWorld {
  void location() {
    System.out.println("Taj Mahal is in Agra, India");
  }

  void year() {
    System.out.println("It was built in 1643 AD");
  }
}

class ChristtheRedeemer extends WondersOfWorld {
  void location() {
    System.out.println("Christ the Redeemer is in Rio de Janeiro, Brazil");
  }

  void year() {
    System.out.println("It was built in 1931 AD");
  }
}
class Main{
  public static void main(String args[]){ 
    WondersOfWorld W = new WondersOfWorld();
    WondersOfWorld G1 = new GizaPyramids();
 
    WondersOfWorld G2 = new GreatWallofChina();
 
    WondersOfWorld C1 = new Colosseum();
    WondersOfWorld C2=new ChichénItzá();
    WondersOfWorld C3=new ChristtheRedeemer();
    WondersOfWorld P=new Petra();
    WondersOfWorld T=new TajMahal();
    WondersOfWorld M=new MachuPicchu();

   W.location();
   W.year();

   G1.location();
   G1.year();

   G2.location();
   G2.year();

   C1.location();
   C1.year();

   C2.location();
   C2.year();

   C3.location();
   C3.year();

   P.location();
   P.year();

   T.location();
   T.year();

   M.location();
   M.year();
   
  }  
}  