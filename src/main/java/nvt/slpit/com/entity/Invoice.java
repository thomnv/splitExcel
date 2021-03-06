package nvt.slpit.com.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Invoice {
    private int  index = 1;
    
    private String sign;
    
    private String invoiceNumber;
    
    private String invoiceDate;
    
    private String taxValue;
}
