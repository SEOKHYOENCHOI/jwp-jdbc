package nextstep.jdbc;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ArgumentPreparedStatementSetter implements PreparedStatementSetter {
    private final Object[] values;

    public ArgumentPreparedStatementSetter(Object... values) {
        this.values = values;
    }

    @Override
    public void setValues(PreparedStatement preparedStatement) throws SQLException {
        for (int i = 0; i < values.length; i++) {
            preparedStatement.setObject(i + 1, values[i]);
        }
    }
}
