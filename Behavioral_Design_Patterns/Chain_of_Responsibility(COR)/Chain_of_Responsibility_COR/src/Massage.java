public class Massage {

        private  String number ;
        private  String massageUser;

        private  boolean check = false;

        private Integer Point = 100 ;

        public Massage(String number, String massageUser) {
            this.number = number;
            this.massageUser = massageUser;
        }

        public String getNumber() {
            return number;
        }

        public String getMassageUser() {
            return massageUser;
        }

        public Integer getPoint() {
            return Point;
        }

        public void setPoint(Integer point) {
            Point = point;
        }

        public boolean isCheck() {
            return check;
        }

        public void setCheck(boolean check) {
            this.check = check;
        }
    }


