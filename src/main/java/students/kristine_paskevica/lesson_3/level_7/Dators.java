package students.kristine_paskevica.lesson_3.level_7;

 class Dators {

     String tips;
     String razotajs;
     String krasa;
     float displejaIzmers;

     void datoraIpasibas() {
         System.out.println("Mana datora tips ir " + tips + ", " + razotajs + " ražojums.");
         System.out.println("Datora krāsa ir " + krasa);
         System.out.println("Displeja izmērs ir " + displejaIzmers);
     }
     void displejaIzmMaina(){
         displejaIzmers++;
         System.out.println("Nomainīju jaunu displeju - lielāku: " + displejaIzmers + " collas");
     }}


