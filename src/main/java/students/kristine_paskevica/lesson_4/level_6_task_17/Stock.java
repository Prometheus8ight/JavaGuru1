package students.kristine_paskevica.lesson_4.level_6_task_17;

 class Stock {

    String kompanijasNosauk;
    int tekoshaMaksa;
    int minMaksa;
    int maxMaksa;

    public Stock(String kompanijasNosauk, int tekoshaMaksa){
     this.kompanijasNosauk = kompanijasNosauk;
     this.tekoshaMaksa = tekoshaMaksa;
     this.minMaksa = tekoshaMaksa;
     this.maxMaksa = tekoshaMaksa;
    }

    public void vertibuAtjaunoshana(int jaunaVertiba){
     tekoshaMaksa = jaunaVertiba;
     if (jaunaVertiba > maxMaksa){
      maxMaksa = jaunaVertiba;
      }
       else if (jaunaVertiba < minMaksa){
        minMaksa = jaunaVertiba;
      }
    }

    String getPriceInformation(){

      return "Company: " + kompanijasNosauk + " Current Price: " + tekoshaMaksa + " Min Price: " + minMaksa + " Max Price: " + maxMaksa;

    }

 }
