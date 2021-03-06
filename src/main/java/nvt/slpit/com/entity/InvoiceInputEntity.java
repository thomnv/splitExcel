package nvt.slpit.com.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class InvoiceInputEntity {

    private int index = 1;

    private int code = 1;

    private String saleCompanyCode;

    private String saleCompanyName;

    private String sign;

    private String invoiceNumber;

    private String invoiceDate;

    private String taxValue;

    private String companyName;

    private String taxCode;

    private String coQuanQuanLy;

}
