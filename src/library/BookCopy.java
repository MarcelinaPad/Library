package library;

public class BookCopy extends Book{
    private int catalogNumber;
    public BookCopy(String title, String author, int yearOfPublication, int catalogNumber) {
        super(title, author, yearOfPublication);
        this.catalogNumber = catalogNumber;
    }

    public int getCatalogNumber() {
        return catalogNumber;
    }

    public void setCatalogNumber(int catalogNumber) {
        this.catalogNumber = catalogNumber;
    }

    @Override
    public String descriptionOfBook() {
        return super.descriptionOfBook() + ". Catalog number: " + catalogNumber;

    }

    @Override
    public int hashCode() {
        int result = getTitle().hashCode();
        result = 31 * result + getAuthor().hashCode();
        result = 31 * result + Integer.hashCode(getYearOfPublication());
        result = 31 * result + Integer.hashCode(catalogNumber);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BookCopy other = (BookCopy) obj;
        return this.getTitle().equals(other.getTitle()) &&
                this.getAuthor().equals(other.getAuthor()) &&
                this.getYearOfPublication() == other.getYearOfPublication() &&
                this.catalogNumber == other.getCatalogNumber();
    }
}
