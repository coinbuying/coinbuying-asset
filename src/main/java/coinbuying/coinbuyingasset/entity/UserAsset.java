package coinbuying.coinbuyingasset.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Table(value="user_asset")
@AllArgsConstructor
@Getter
@Builder
@ToString
public class UserAsset {
    @Id
    @Column(value="asset_id")
    private Long assetId;

    @Column(value="user_id")
    private int userId;

    @Column(value="ticker")
    private String ticker;

    @Column(value="market")
    private String market;

    @Column(value="price")
    private Double price;

    @Column(value="volume")
    private Double volume;

    @Column(value="insert_dt")
    private LocalDate insertDt;
}