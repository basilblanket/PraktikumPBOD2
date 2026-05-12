public class mainDAO {
    public static void main(String[] args) {
        Person person = new Person("Basil");
        DAOManager manager = new DAOManager();
        manager.setPersonDAO(new MySQLPersonDAO());
        try {
            manager.getPersonDAO().savePerson(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

