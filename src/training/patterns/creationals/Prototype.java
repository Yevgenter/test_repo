package training.patterns.creationals;

public class Prototype {
    public static void main(String[] args) throws CloneNotSupportedException {

        Cookie[] cookies = new Cookie[10];
        Cookie tempCookie =null;
        Cookie prot = new CoconutCookie();
        CookieMachine cm = new CookieMachine(prot);
        for (int i = 0; i < cookies.length ; i++) {
            cookies[i] = cm.makeCookie();
        }

        for (Cookie cookie:cookies
             ) {
            System.out.println(cookie.hashCode());
        }

    }
}

class Cookie implements Cloneable {

    protected int weight;

    @Override
    protected Cookie clone() throws CloneNotSupportedException {
        Cookie copy = (Cookie) super.clone();
        return copy;
    }
}

class CoconutCookie extends Cookie{

}

class CookieMachine{
    private Cookie cookie;

    public CookieMachine(Cookie cookie) {
        this.cookie = cookie;
    }

    public Cookie makeCookie() throws CloneNotSupportedException{
        return (Cookie)this.cookie.clone();
    }

}

