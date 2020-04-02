package legoset;

import lombok.Data;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.Year;
import java.util.List;
import java.util.Set;

@XmlType(propOrder = {"number", "name", "theme", "subtheme", "year", "pieces","tags","minifigs","weight","url"})
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class LegoSet {

    @XmlAttribute
    private String number;
    private String name;
    private String theme;
    private String subtheme;
    private int pieces;

    @XmlJavaTypeAdapter(YearAdapter.class)
    private Year year;

    @XmlElementWrapper(name = "tags")
    @XmlElement( name = "tag")
    private Set<String> tags;

    @XmlElementWrapper(name = "minifigs")
    @XmlElement( name = "minifig")
    private List<Minifig> minifigs;

    @XmlElement( name = "weight")
    private Weight weight;

    private String url;

}
