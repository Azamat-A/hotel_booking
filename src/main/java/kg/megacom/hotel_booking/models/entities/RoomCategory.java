package kg.megacom.hotel_booking.models.entities;

import kg.megacom.hotel_booking.models.enums.ETypeOfRoom;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@Table(name = "tb_room_category")
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RoomCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Enumerated(EnumType.STRING)
    ETypeOfRoom typeOfRoom;
}
