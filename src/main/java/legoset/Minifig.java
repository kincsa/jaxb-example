package legoset;

import lombok.Data;

import javax.xml.bind.annotation.*;

@XmlRootElement
@Data
@XmlAccessorType(XmlAccessType.FIELD)

public class Minifig {

    @XmlAttribute
    private int count;

    @XmlValue
    private String nameOfMinifig;

    public Minifig(){}

    public Minifig(int count, String nameOfMinifig){

        this.count=count;
        this.nameOfMinifig=nameOfMinifig;
    }

}
