
    public class Bike {

        private String name;
        private boolean isOn;

        public Bike(String name, boolean isOn) {
            this.name = name;
            this.isOn = isOn;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setOn(boolean isOn) {
            this.isOn = isOn;
        }

        public boolean isOn() {
            return isOn;
        }

    }
