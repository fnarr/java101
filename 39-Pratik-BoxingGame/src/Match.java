public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run(){
        if (isCheck()){
            starter();
            System.out.println("--------------------------------------------");
            System.out.println("İlk vuruşu " + this.f1.name + " yapacak.");
            System.out.println("--------------------------------------------");
            while (this.f1.health > 0 && this.f2.health > 0){
                System.out.println("====YENİ ROUND====");
                this.f2.health = this.f1.hit(this.f2);
                if (isWin()){
                    break;
                }
                this.f1.health = this.f2.hit(this.f1);
                if (isWin()){
                    break;
                }
                System.out.println(this.f1.name + " Sağlık: " + this.f1.health);
                System.out.println(this.f2.name + " Sağlık: " + this.f2.health);
            }
        }else{
            System.out.println("Sporcuların sikletleri uymuyor");
        }
    }

    boolean isCheck(){
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight && this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin(){
        if (this.f1.health == 0){
            System.out.println(this.f2.name + " kazandı!");
            return true;
        }

        if (this.f2.health == 0){
            System.out.println(this.f1.name + " kazandı!");
            return true;
        }

        return false;
    }

    void starter(){
        double randomStart = Math.random();
        if (randomStart < 0.5){
            Fighter starter = this.f1;
            this.f1 = this.f2;
            this.f2 = starter;
        }
    }
}
