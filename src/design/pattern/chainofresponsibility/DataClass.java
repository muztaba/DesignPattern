package design.pattern.chainofresponsibility;

public final class DataClass {

    private final String id;
    private final String name;
    private final String address;

    private DataClass(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public static DataClass empty() {
        return new  DataClass("", "", "");
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private String id;
        private String name;
        private String address;

        private Builder () {}

        private Builder(String id, String name, String address) {
            this.id = id;
            this.name = name;
            this.address = address;
        }

        public Builder from(DataClass dataClass) {
            this.id = dataClass.id;
            this.name = dataClass.name;
            this.address = dataClass.address;
            return new Builder(id, name, address);
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAdress(String address) {
            this.address = address;
            return this;
        }

        public DataClass build() {
            return new DataClass(this.id, this.name, this.address);
        }
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "DataClass{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
