package com.rebindme.vendor.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-03T19:17:07.531568+02:00[Europe/Paris]")

@Controller
@RequestMapping("${openapi.rebindMeVendor.base-path:/vendor}")
public class VendorApiController implements VendorApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public VendorApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
