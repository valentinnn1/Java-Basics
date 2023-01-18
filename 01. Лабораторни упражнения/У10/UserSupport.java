package lab_exercises.lab_10;

public class UserSupport extends User {
    private String username;

    public UserSupport(String username) {
        this.username = username;
    }

    public UserType getUserType() {
        return UserType.SUPPORT;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void supportResolver(int index) {
        if (!MailBox.inbox.get(index).isMarkedForWork()) {
            MailBox.inbox.get(index).setMarkedForWork(true);
        }

        if (!MailBox.inbox.get(index).isResolved()) {
            MailBox.inbox.get(index).setResolved(true);
            MailBox.archive.add(MailBox.inbox.get(index));
            MailBox.inbox.remove(MailBox.inbox.get(index));
        }
    }
}