package vn.edu.iuh.fit.climpingrose.dtos.requests; // Đô check lại package cho đúng thư mục nhé

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class VerifyOtpRequest {
    String email;
    String otp;
}