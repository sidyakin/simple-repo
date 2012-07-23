/**
 * Created with IntelliJ IDEA.
 * User: Test
 * Date: 23.07.12
 * Time: 17:39
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public String str;
    private Integer uuid;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Main main = (Main) o;

        if (str != null ? !str.equals(main.str) : main.str != null) return false;
        if (uuid != null ? !uuid.equals(main.uuid) : main.uuid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = str != null ? str.hashCode() : 0;
        result = 31 * result + (uuid != null ? uuid.hashCode() : 0);
        return result;
    }
}
