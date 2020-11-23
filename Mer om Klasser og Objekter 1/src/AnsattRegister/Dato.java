package AnsattRegister;

public class Dato {

    private int dag, måned, år;

        public Dato(int dag, int måned, int år) {
            this.dag = dag;
            this.måned = måned;
            this.år = år;
        }

            public String toString() {
            return dag + ". " + månedsnavn(måned) + " " + år;
            }

        private static String månedsnavn(int mnd) {
            String[] navnMåned = {"januar", "februar", "mars", "april", "mai",
                    "juni", "juli", "august", "september", "oktober", "november",
                    "desember"};

            if (mnd > 0 && mnd < 13) {
                return navnMåned[mnd-1];
            }
                else {
                    return "Ukjent måned";
            }
        }
}
