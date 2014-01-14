package example.models;

import java.io.Serializable;


public class Tweet implements Serializable
{
    private byte[] key;
    private String uname;
    private String body;

    public Tweet(final byte[] key, final String uname, final String body) {
        this.key = key;
        this.uname = uname;
        this.body = body;
    }

    public byte[] getKey() {
        return key;
    }

    public String getUname() {
        return uname;
    }

    public String getBody() {
        return body;
    }
}
