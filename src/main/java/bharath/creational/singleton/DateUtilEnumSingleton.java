package bharath.creational.singleton;

/*
    Singleton through use of enum.
    Solves the problem of reflection problem.
    Basically all the other methods of singleton creation
    that we've seen so far suffer the problem that someone can
    easily get hold of constructors through reflection api,
    then change their visibility to public and eventually call the
    constructor to get a new instance as many times as they want since
    calling the constructor would yield a brand-new instance every time.

    Since with enums, there's no constructor at all (not even default), there's
    no way to break this singleton, even through reflection.
 */
public enum DateUtilEnumSingleton {
    INSTANCE; //this is the singleton instance.
}
