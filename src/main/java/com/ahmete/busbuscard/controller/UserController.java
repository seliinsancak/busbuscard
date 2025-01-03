package com.ahmete.busbuscard.controller;

import static com.ahmete.busbuscard.constans.RestApi.*;

import com.ahmete.busbuscard.dto.request.UpdateUserRequestDto;
import com.ahmete.busbuscard.dto.response.BaseResponse;
import com.ahmete.busbuscard.entity.User;
import com.ahmete.busbuscard.service.UserService;
import com.ahmete.busbuscard.views.VwUser;
import com.ahmete.busbuscard.views.VwUserDetail;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(USER)
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    /**
     * localhost:9090/user/register
     */
    @GetMapping(SEARCH)
    public ResponseEntity<BaseResponse<User>> searchUser(String tc) {

        return ResponseEntity.ok(BaseResponse.<User>builder()
                .success(true)
                .code(200)
                .message("Searching Result")
                .data(userService.findByTC(tc))
                .build());

    }

    @GetMapping(GETALLUSERS)
    public ResponseEntity<BaseResponse<List<VwUser>>> getAllUsers() {
        return ResponseEntity.ok(BaseResponse.<List<VwUser>>builder()
                .success(true)
                .code(200)
                .message("List of users")
                .data(userService.getAllUsers())
                .build());
    }

    //TODO calısmıyor bakılacak
    @GetMapping(GETUSER)
    public ResponseEntity<BaseResponse<VwUserDetail>> getUserDetail(String tc) {
        return ResponseEntity.ok(BaseResponse.<VwUserDetail>builder()
                .success(true)
                .code(200)
                .message("User detail")
                .data(userService.getUserByTC(tc).get())
                .build());
    }
    //TODO: adres güncelleme de ekle!
    @PutMapping(UPDATE)
    public ResponseEntity<BaseResponse<Boolean>>updateUser(@RequestBody  @Valid UpdateUserRequestDto dto){
        userService.updateUser(dto);
        return ResponseEntity.ok(
                BaseResponse.<Boolean>builder()
                        .success(true)
                        .code(200)
                        .message("User updated")
                        .data(true)
                        .build());
    }

}