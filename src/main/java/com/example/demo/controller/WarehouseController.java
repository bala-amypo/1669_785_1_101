import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import java.util.*;


@RestController
@RequestMapping("/api/warehouses")
@Tag(name = "Warehouse")
public class WarehouseController {


private final WarehouseService warehouseService;


public WarehouseController(WarehouseService warehouseService) {
this.warehouseService = warehouseService;
}


@PostMapping
public Warehouse create(@RequestBody Warehouse warehouse) {
return warehouseService.createWarehouse(warehouse);
}


@GetMapping
public List<Warehouse> getAll() {
return warehouseService.getAllWarehouses();
}


@GetMapping("/{id}")
public Warehouse get(@PathVariable Long id) {
return warehouseService.getWarehouse(id);
}
}