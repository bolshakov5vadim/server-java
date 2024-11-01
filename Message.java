import java.io.Serializable;
    /* This class is sending between server and clients */
    public class Message implements Serializable {
        private String userName;
        private String date;
        private String IP;
        private String state;
       private String str;
        private static final long serialVersionUID = 1L;
        Message( String userName, String date, String IP, String state ) {
            this.userName = userName;
            this.date = date;
            this.IP = IP;
            this.state = state;
        }
        void setMessageText( String messageText ) {
            this.str = messageText;
        }
        String getMessageText() { return str; }
           }

