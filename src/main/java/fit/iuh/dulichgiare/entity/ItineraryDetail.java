package fit.iuh.dulichgiare.entity;
// Generated Mar 13, 2023, 11:14:32 AM by Hibernate Tools 4.3.6.Final

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * Itinerarydetail generated by hbm2java
 */
@Entity
@Table(name = "itinerarydetail")
public class ItineraryDetail implements java.io.Serializable {

    private long id;
    private Itinerary itinerary;
    private String titile;
    private String description;

    public ItineraryDetail() {

    }

    public ItineraryDetail(long id, Itinerary itinerary, String titile, String description) {
        this.id = id;
        this.itinerary = itinerary;
        this.titile = titile;
        this.description = description;
    }

    /**
     * @param itinerary
     * @param titile
     * @param description
     */
    public ItineraryDetail(Itinerary itinerary, String titile, String description) {
        super();
        this.itinerary = itinerary;
        this.titile = titile;
        this.description = description;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "itinerary_id", nullable = false)
    public Itinerary getItinerary() {
        return this.itinerary;
    }

    public void setItinerary(Itinerary itinerary) {
        this.itinerary = itinerary;
    }

    @Column(name = "titile", nullable = false)
    public String getTitile() {
        return this.titile;
    }

    public void setTitile(String titile) {
        this.titile = titile;
    }

    @Column(name = "description", nullable = false)
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
