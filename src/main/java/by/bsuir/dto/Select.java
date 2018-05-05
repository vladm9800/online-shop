package by.bsuir.dto;

public class Select {
   private Long idPhoneOne;
   private Long idPhoneTwo;

    public Long getIdPhoneOne() {
        return idPhoneOne;
    }

    public void setIdPhoneOne(Long idPhoneOne) {
        this.idPhoneOne = idPhoneOne;
    }

    public Long getIdPhoneTwo() {
        return idPhoneTwo;
    }

    public void setIdPhoneTwo(Long idPhoneTwo) {
        this.idPhoneTwo = idPhoneTwo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Select select = (Select) o;

        if (idPhoneOne != null ? !idPhoneOne.equals(select.idPhoneOne) : select.idPhoneOne != null) return false;
        return idPhoneTwo != null ? idPhoneTwo.equals(select.idPhoneTwo) : select.idPhoneTwo == null;
    }

    @Override
    public int hashCode() {
        int result = idPhoneOne != null ? idPhoneOne.hashCode() : 0;
        result = 31 * result + (idPhoneTwo != null ? idPhoneTwo.hashCode() : 0);
        return result;
    }
}
