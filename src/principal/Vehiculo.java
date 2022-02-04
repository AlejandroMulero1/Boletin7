package principal;


    public class Vehiculo {
        //Enum que contiene las marcas
        private enum MarcaVehiculo{FORD,TOYOTA,SUZUKI,RENAULT,SEAT};
        private String matricula;
        private MarcaVehiculo marca;

        //Constructor por defecto
        public Vehiculo(){
            matricula = "";
            marca = null;
        }

        //Setters y Getters necesarios
        public void setMatricula(String datoMatricula){
            matricula = datoMatricula;
        }

        public void setMarca(String datoMarca){
            switch(datoMarca){
                case "ford":
                    marca = MarcaVehiculo.FORD;
                    break;
                case "toyota":
                    marca = MarcaVehiculo.TOYOTA;
                    break;
                case "suzuki":
                    marca = MarcaVehiculo.SUZUKI;
                    break;
                case "renault":
                    marca = MarcaVehiculo.RENAULT;
                    break;
                case "seat":
                    marca = MarcaVehiculo.SEAT;
                    break;
                default:
                    System.out.println("Marca de vehiculo no registrado.");
                    break;
            }
        }

        public String getMatricula(){
            return matricula;
        }

        public String getMarca(){
            return marca.toString().toLowerCase();
        }
    }

