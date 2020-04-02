package legoset;

import lombok.Data;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@Data
public class Weight {

    @XmlAttribute
    private String unit;

    @XmlValue
    private double value;

    public Weight(){}

    public Weight(String unit, double value){
        this.unit=unit;
        this.value=value;
   }

}
