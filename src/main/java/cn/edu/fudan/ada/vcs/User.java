package cn.edu.fudan.ada.vcs;
abstract public class User{
    protected static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
    protected static final String DB_URL="jdbc:mysql://10.240.0.241/vcs?useSSL=no";
    protected final String id;
    protected final String pass;

    User(String user,String password){
        id=user;
        pass=password;
    }
    public abstract void enterSystem();
}
