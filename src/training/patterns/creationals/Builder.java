package training.patterns.creationals;

public class Builder {
    public static void main(String[] args) {
       Computer computer = Computer.builder().setDisplay("Display").setSystemBlock("SystemBlock").build();
        System.out.println(computer.toString());
    }
}

class Computer {
    private String display = null;
    private String systemBlock = null;

    private Computer(){
    }

    public String getDisplay() {
        return display;
    }

    public String getSystemBlock() {
        return systemBlock;
    }

    public static Builder builder(){
        return new Computer().new Builder();
    }

    @Override
    public String toString() {
        return "Computer{" +
                "display='" + display + '\'' +
                ", systemBlock='" + systemBlock + '\'' +
                '}';
    }

    public class Builder{

        private Builder(){}

        public Builder setDisplay(String display){
            Computer.this.display = display;
            return this;
        }
        public Builder setSystemBlock(String systemBlock){
            Computer.this.systemBlock = systemBlock;
            return this;
        }
        public Computer build(){
            return Computer.this;
        }
    }
}


