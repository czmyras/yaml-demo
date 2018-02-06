package Connection;

public class Connection {

    private String url;
    private int poolSize;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getPoolSize() {
        return poolSize;
    }

    public void setPoolSize(int poolSize) {
        this.poolSize = poolSize;
    }

    @Override
    public String toString() {
        return "Connection{" +
                "url='" + url + '\'' +
                ", poolSize=" + poolSize +
                '}';
    }
}
