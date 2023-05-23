package HW.comparator;

    public class StrList implements Comparable<StrList> {
        private String listStrings;

        public StrList(String listStrings) {
            this.listStrings = listStrings;
        }

        public String getListStrings() {
            return listStrings;
        }

        public void setListStrings(String listStrings) {
            this.listStrings = listStrings;
        }


        @Override
        public String toString() {
            return "Strings{" +
                    "listStrings='" + listStrings + '\'' +
                    '}';
        }

        @Override
        public int compareTo(StrList o) {
            return listStrings.compareTo(o.listStrings);
        }
    }

