public interface Fly {
    // décoller
    void takeOff();

    //monter, retourne la monter
    int ascend(int meters);

    //planer
    void glide();
    
    //descendre, retourne la descente
    int descend(int meters);

    //atterrir, raz
    void land();
    
}
