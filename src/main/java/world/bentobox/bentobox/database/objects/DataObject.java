package world.bentobox.bentobox.database.objects;

import world.bentobox.bentobox.BentoBox;

/**
 * Contains fields that must be in any data object
 * DataObject's canonical name must be no more than 62 characters long otherwise it may not fit in a database table name
 * @author tastybento
 *
 */
public interface DataObject {

    default BentoBox getPlugin() {
        return BentoBox.getInstance();
    }

    /**
     * @return the uniqueId
     */
    String getUniqueId();

    /**
     * @param uniqueId - unique ID the uniqueId to set
     */
    void setUniqueId(String uniqueId);

}
