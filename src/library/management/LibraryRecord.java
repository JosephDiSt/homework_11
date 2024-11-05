package library.management;

public final class LibraryRecord {
    private final int recordId;
    private final String itemName;

    public LibraryRecord(int recordId, String itemName) {
        this.recordId = recordId;
        this.itemName = itemName;
    }

    public int getRecordId() {
        return recordId;
    }

    public String getItemName() {
        return itemName;
    }

    public void finalizeRecord() {
        System.out.println("Record " + recordId + " for item " + itemName + " is finalized.");
    }
}
