public class AddingPosterManager {

    private int limit;
    private String[] names = new String[0];

    public  AddingPosterManager() {
        limit = 5;
    }

      public void AddingPosterManager(String newName) {

   //  String[] names = new String[];

        String[] tmp = new String[names.length + 1];
        for (int i = 0; i < names.length; i++) {
            tmp[i] = names[i];
        }
        tmp[tmp.length - 1] = newName;
        names = tmp;

    }

    public String[] findAll() {
        return names;
    }
}


 //  public String[] findLast() {



 //  }


