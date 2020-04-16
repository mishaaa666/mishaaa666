package fourthLesson.abstractSimple;

abstract class AbstractMain {

    private String methodName;

    abstract String gerStr(int digit);

    abstract void info();

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }
}
