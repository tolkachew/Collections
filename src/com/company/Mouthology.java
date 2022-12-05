package com.company;

public class Mouthology {
    public static void main(String[] args) {
        Person1 professor = Person1.build()
                .setProfession("professor")
                .setBiology(true)
                .setEcology(true)
                .setGeography(true)
                .getPerson();
        System.out.println(professor.toString());

        Person1 sailor = Person1.build()
                .setAssology(true)
                .setEcology(true)
                .setGeography(true)
                .getPerson();
        System.out.println(sailor.toString());


    }
}

class Person1{
    public static Builder build(){
        return new Person1().new Builder();
    }


    public String getProfession() {
        return profession;
    }

    public boolean isBiology() {
        return biology;
    }

    public boolean isEcology() {
        return ecology;
    }

    public boolean isZoology() {
        return zoology;
    }

    public boolean isGeography() {
        return geography;
    }

    public boolean isPhysiology() {
        return physiology;
    }

    public boolean isSwiminology() {
        return swiminology;
    }

    public boolean isEscapology() {
        return escapology;
    }

    public boolean isSharkology() {
        return sharkology;
    }

    public boolean isCrocodilogy() {
        return crocodilogy;
    }

    public boolean isAssology() {
        return assology;
    }

    public boolean isHeadology() {
        return headology;
    }

    public boolean isMouthology() {
        return mouthology;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "profession='" + profession + '\'' +
                ", biology=" + biology +
                ", ecology=" + ecology +
                ", zoology=" + zoology +
                ", geography=" + geography +
                ", physiology=" + physiology +
                ", swiminology=" + swiminology +
                ", escapology=" + escapology +
                ", sharkology=" + sharkology +
                ", crocodilogy=" + crocodilogy +
                ", assology=" + assology +
                ", headology=" + headology +
                ", mouthology=" + mouthology +
                '}';
    }

    public class Builder {

        public Builder setProfession(String profession) {
            Person1.this.profession = profession;
        return this;}

        public Builder setBiology(boolean biology) {
            Person1.this.biology = biology;
        return this;}

        public Builder setEcology(boolean ecology) {
            Person1.this.ecology = ecology;
        return this;}

        public Builder setZoology(boolean zoology) {
            Person1.this.zoology = zoology;
        return this;}

        public Builder setGeography(boolean geography) {
            Person1.this.geography = geography;
        return this;}

        public Builder setPhysiology(boolean physiology) {
            Person1.this.physiology = physiology;
        return this;}

        public Builder setSwiminology(boolean swiminology) {
            Person1.this.swiminology = swiminology;
        return this;}

        public Builder setEscapology(boolean escapology) {
            Person1.this.escapology = escapology;
        return this;}

        public Builder setSharkology(boolean sharkology) {
            Person1.this.sharkology = sharkology;
        return this;}

        public Builder setCrocodilogy(boolean crocodilogy) {
            Person1.this.crocodilogy = crocodilogy;
        return this;}

        public Builder setAssology(boolean assology) {
            Person1.this.assology = assology;
        return this;}

        public Builder setHeadology(boolean headology) {
            Person1.this.headology = headology;
        return this;}

        public Builder setMouthology(boolean mouthology) {
            Person1.this.mouthology = mouthology;
        return this;}

        public Person1 getPerson(){
            return Person1.this;
        }
    }
        private String profession = "";
        private boolean biology = false;
        private boolean ecology = false;
        private boolean zoology = false;
        private boolean geography = false;
        private boolean physiology = false;
        private boolean swiminology = false;
        private boolean escapology = false;
        private boolean sharkology = false;
        private boolean crocodilogy = false;
        private boolean assology = false;
        private boolean headology = false;
        private boolean mouthology = false;
}

